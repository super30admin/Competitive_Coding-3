import java.util.HashMap;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// We use hash map with the frequency of each element
// Then Iterate over keys and check if diff is present or not

class Solution1 {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return 0;

        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        // Convert to freq map
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Iterate over keys and check if diff is present or not
        for (int key : map.keySet()) {
            int diff = key - k;
            // Handling special case
            if (k == 0) {
                if (map.get(diff) >= 2) {
                    count++;
                }
            } else {
                if (map.containsKey(diff)) {
                    count++;
                }
            }
        }

        return count;
    }
}