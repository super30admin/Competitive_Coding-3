import java.util.HashMap;
import java.util.Map;

class Solution {
    // Time Complexity: O(n) 
    // Space Complexity: O(n)
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0; // Absolute difference cannot be negative
        
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        // Count occurrences of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Find unique k-diff pairs
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            
            if (k == 0) {
                // If k is 0, count elements appearing more than once
                if (value > 1) count++;
            } else {
                // If k > 0, check if key + k exists in the map
                if (map.containsKey(key + k)) count++;
            }
        }
        
        return count;
    }
}
