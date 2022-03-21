// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes, cannot take the second pointer from the end as no decision can be taken when diff > k, we can either increase the start pointer or decrease the end pointer. Both will give me a lesser value.
// It is better to start both the pointers from the start as then start remains fix and we know that both the values will only be increasing and not decreasing.


import java.util.Arrays;

// APPROACH:
/* take 2 pointers, start and end, loop till both are less than the length of the array
1. if (end value - start value) > k, then we increase the value getting subtracted ie start
2. If (end value - start value) < k, then we increase the value from which we are subtracting ie end
3. If equal to k, we increase both the pointers and also count of the pairs found.

Note:
1. To handle duplicates, keep on increasing end till you find a diff value or end hits the length of the array.
2. if start==end, increment end.
*/
public class KDiffPairs {
    public static int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int slow = 0, fast =0, count=0;
        while(slow < nums.length && fast <nums.length){
            if(slow == fast ||nums[fast]-nums[slow] < k){
                fast++;
            }else if (nums[fast]-nums[slow] > k){
                slow++;
            }else{
                fast++;
                slow++;
                count++;
                while(fast< nums.length && nums[fast] == nums[fast-1]){
                    fast++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] nums1 = {3,1,4,1,5};
        int k = 2;
        System.out.println(findPairs(nums1, k)); //2

        int[] nums2 = {1,2,3,4,5};
        int k2 = 1;
        System.out.println(findPairs(nums2, k2)); //4

        int[] nums3 = {1,3,1,5,4};
        int k3 = 0;
        System.out.println(findPairs(nums3, k3)); //1
    }
}
