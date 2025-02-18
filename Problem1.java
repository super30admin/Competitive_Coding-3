
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
use hashmap to check if element exists to form pair
 */

class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums == null)
            return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int count = 0;

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            int key = m.getKey();
            int val = m.getValue();
            if (k > 0 && map.containsKey(key - k)) {
                count++;
            } else if (k == 0 && val > 1) {
                count++;
            }
        }
        return count;

    }
}
