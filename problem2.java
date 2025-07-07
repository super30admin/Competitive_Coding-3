// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach: Used a HashMap to store elements and a boolean to check if it is duplicate or not.
// Then used a HashSet to avoid counting duplicates in the result. Iterated through the array and found if nums[i]+k exists in the map. Only doing forward search since (a,b) and (b,a) are considered the same.

import java.util.HashMap;
import java.util.HashSet;
class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for(int n : nums){
            if(map.containsKey(n)) map.put(n, true); 
            else map.put(n, false); 
        }
        HashSet<Integer> seen = new HashSet<>();
        int count = 0;

        for(int i = 0; i<nums.length;i++){
            if (seen.contains(nums[i])) continue;
            seen.add(nums[i]);
            if (k == 0) {
                if (map.get(nums[i])) count++; 
            } else {
                int targetPlus = nums[i] + k;
                if (map.containsKey(targetPlus)) count++;
            }
        }
        return count;
    }

}
