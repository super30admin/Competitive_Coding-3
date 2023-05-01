// Time Complexity : O(n)
// Space Complexity : O(n) (for the HashMap)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

/*
 * Approach
 * In order to find the pairs, we iterate over the array once and store all the
 * items in a HashMap with the key as the element and value as the frequency.
 * This will optimize the lookup when we make a second pass over the array
 * to check whether the diff of the current element and k is present in the Map.
 * If it is, then we add to the result.
 */

import java.util.HashMap;

class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        int c = 0;
        HashMap<Integer, Integer> m = new HashMap<>();

        // add to hashmap to make lookup constant
        for(int i = 0; i < nums.length; i++) {
            m.put(nums[i], m.getOrDefault(nums[i],0)+1); // frequency of occurrence
        }

        // find pairs that have difference == k
        for(Integer key: m.keySet()) {
            if(k == 0 && m.get(key) > 1) {
                c++;
            }
            if(k != 0 && m.containsKey(key + k)) {
                c++;
            }
        }

        return c;
    }
}