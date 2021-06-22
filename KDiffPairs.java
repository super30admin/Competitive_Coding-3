// Time Complexity :  O(N)
// Space Complexity : O(N) // Hashmap
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int count = 0;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                if (entry.getValue() >= 2) {
                    count++;
                }
            } else {
                if (map.containsKey(entry.getKey() + k))
                    count++;
            }
        }
        
        return count;
    }
}