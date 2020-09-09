/*
https://leetcode.com/problems/k-diff-pairs-in-an-array/
532. K-diff Pairs in an Array
Did this code successfully run on Leetcode :: Yes
*/

import java.util.HashMap;
import java.util.Arrays;

public class KDiff {
    /*
    Time Complexity : O(n) + O(unique elements in array) => Populate hashmap + go over values in map
    Space Complexity : O(unique elements in array)
    Approach : Since we want to count every pair only once, irrespective of the order, 
    we can just count the number of times it occurs in the array
    Count is needed to handle the case of k=0, since, an element that occured twice, has count > 1,
    and has to be counted only once.
    */
    public static int findPairsHashMap(int[] nums, int k) {
        int count = 0;

        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num: nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // count elements which occur 2 or more times 
        if (k == 0) {
            for (int key: countMap.keySet()) {
                if (countMap.get(key) >= 2) {
                    count++;
                }
            }
        } else {
            for (int key: countMap.keySet()) {
                if (countMap.containsKey(key + k)) {
                    count++;
                }
            }
        }
        return count;
    }

    /*
    Time Complexity : O(nlogn) + O(n) => to sort the array + traverse the entire array
    Space Complexity : O(1) - constant space
    Approach : Sort the array. After sorting, use 2 pointers at the left and right,
    modify the pointers based on the difference between elements at the left and right pointer
    Important: If we have duplicate elements in the array, after sorting, they will lie one after the other
    So, if a pair with difference k is found, we move the right pointer until we find an element that is different from the previous one.
    */
    public static int findPairsTwoPointer(int[] nums, int k) {
        int count = 0;
        int low = 0, high = 0, n = nums.length;
        Arrays.sort(nums);
        while (low < n && high < n) {
            if (low == high) {
                high++;
            } else if (nums[high] - nums[low] == k) {
                count++;
                high++;

                /// eg. 1 2 3 3 3 4, k = 2  => skip the next 2 threes
                while (high < n && nums[high] == nums[high-1]) {
                    high++;
                }
            } else if (nums[high] - nums[low] < k) {
                high++;
            } else if (nums[high] - nums[low] > k) {
                low++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        System.out.println(findPairsHashMap(new int[] {3, 1, 4, 1, 5}, 2));     // 2
        System.out.println(findPairsHashMap(new int[] {1, 2, 3, 4, 5}, 1));     // 4
        System.out.println(findPairsHashMap(new int[] {1, 3, 1, 5, 4}, 0));     // 1      
        
        System.out.println(findPairsTwoPointer(new int[] {3, 1, 4, 1, 5}, 2));  // 2
        System.out.println(findPairsTwoPointer(new int[] {1, 2, 3, 4, 5}, 1));  // 4
        System.out.println(findPairsTwoPointer(new int[] {1, 3, 1, 5, 4}, 0));  // 1
    }
}