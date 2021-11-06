// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No
import java.util.*;

class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        if (nums.length == 0) {
            return 0;
        }
        
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
            else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        
        for (int key : map.keySet()) {
            if (k == 0) {
                if (map.get(key) >= 2) {
                    count++;
                }
            }
            else {
                if (map.containsKey(key + k)) {
                    count++;
                }
            }
        }
        return count;
    }
}