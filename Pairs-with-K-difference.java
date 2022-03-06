import java.util.HashMap;
import java.util.Map;

// Time Complexity : O(n) where n is # elements in nums
// Space Complexity : O(n) where n is # elements in nums to be stored in map
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int findPairs(int[] nums, int k) {
        
        // can't have abs diff less than 0 or arr empty
        if (k < 0 || nums.length == 0) {
            return 0;
        }
        
        // we store elements in num as KEY
        // and their count as VALUE
        Map<Integer, Integer> map = new HashMap<>();
        
        int count = 0;
        
        for (int num : nums) {
            map.put (num, map.getOrDefault(num, 0) + 1);
        }
        
        for (int i : map.keySet()) {
            
            // here we check the number of duplicate elements in nums
            if (k == 0) {
                if (map.get(i) >= 2) {
                    count++;
                }
            }
            
            else {
                if (map.containsKey(i + k)) {
                    count++;
                }
            }
        }
        
        return count;
    }
}