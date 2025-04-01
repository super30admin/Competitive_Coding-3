// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

class KPairsInArray {
     public int findPairs(int[] nums, int k) {
        if (k < 0) return 0; // k-diff pairs cannot exist for negative k

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        // Count frequencies of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            if (k == 0) {
                // Special case: count elements that appear at least twice
                if (entry.getValue() > 1) {
                    count++;
                }
            } else {
                // Check if num + k exists in the map
                if (map.containsKey(num + k)) {
                    count++;
                }
            }
        }
        return count;
    }
}