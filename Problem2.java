// Time Complexity : O(n^2) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//k-diff pairs in an array
//https://leetcode.com/problems/k-diff-pairs-in-an-array/

import java.util.HashSet;

class Problem2 {
    public int findPairs(int[] nums, int k) {

        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    set.add(nums[i] + nums[j]); // adding the sums in hashset to get unique pairs
                }
            }
        }

        /*
         * for (int ele : set) {
         * System.out.print(ele + " ");
         * }
         */

        return set.size();
    }
}