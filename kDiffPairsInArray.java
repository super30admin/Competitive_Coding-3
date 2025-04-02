//Time Complexity :
//    Approach 1 (Two Pointers) : O(n log n) due to sorting, then O(n) to find pairs
//    Approach 2 (HashMap)      : O(2n) to build frequencies map, then O(n) to iterate map entries (worst case map size is n)
//
//    Space Complexity :
//    Approach 1 (Two Pointers) : O(log n) due to built in sorting algorithm
//    Approach 2 (HashMap)      : O(n) due to frequencies map
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach -
//Approach 1 (Two Pointers):
// Sort the array. Use two pointers (start, end). Compute difference nums[end] - nums[start].
// If difference < k, increment end. If difference > k, increment start. When difference == k, found pair. Increment count, move start forward and skip duplicates.
//Approach 2 (HashMap):
// Build a frequency map of all numbers. Traverse the map:
//    - If k > 0, check if (key + k) exists in map => increment count.
//    - If k == 0, check if frequency of that key > 1 => increment count.


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class kDiffPairsInArray {
    public int findPairs_2Ptrs(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int start = 0, end = 1;
        int n = nums.length;

        while(start < n && end < n) {
            if(start == end || nums[end] - nums[start] < k) {
                //if start and end are at same place and diff betn nums[end] and nums[start] < k then incr end
                end++;
            } else if(nums[end] - nums[start] > k) {
                //if diff is > k then we wont get any pair for start no, so incr start
                start++;
            } else {
                //diff is equal to k -> pair found case
                start++;
                count++;
                while((start < n) && nums[start] == nums[start - 1]) { //duplicates of nums[start]
                    start++;
                }
            }
        }

        return count;
    }


     public int findPairs_HashMap(int[] nums, int k) {
         int count = 0;

         HashMap<Integer, Integer> frequencies = new HashMap<>();
         for(int n: nums) { //storing frequencies of all nums
             frequencies.put(n, frequencies.getOrDefault(n, 0) + 1);
         }

         //traverse in map
         for(Map.Entry<Integer, Integer> entry: frequencies.entrySet()) {
             int key = entry.getKey();
             int val = entry.getValue();
             if(k > 0 && frequencies.containsKey(key + k)) {    //if k > 0 and map contains key + k -> pair found case so increase count
                 count++;
             } else if(k == 0 && val > 1) { //edge case - when k=0 and atleast one no is duplicated then found pair so increase count
                 count++;
             }
         }

         return count;  //return count
     }

    public static void main(String[] args) {
        kDiffPairsInArray solver = new kDiffPairsInArray();

        int[] nums1 = {3,1,4,1,5};
        int k1 = 2;
        System.out.println("Two Pointers approach (nums1, k=2): " + solver.findPairs_2Ptrs(nums1, k1));
        System.out.println("HashMap approach (nums1, k=2): " + solver.findPairs_HashMap(nums1, k1));

        int[] nums2 = {1,3,1,5,4};
        int k2 = 0;
        System.out.println("\nTwo Pointers approach (nums2, k=0): " + solver.findPairs_2Ptrs(nums2, k2));
        System.out.println("HashMap approach (nums2, k=0): " + solver.findPairs_HashMap(nums2, k2));
    }
}
