/* Time Complexity: O(n)
 * Space Complexity: O(n)
 * Did this code successfully run on Leetcode : yes
 * Any problem you faced while coding this : No
 */

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findPairs(int[] nums, int k) {
        int result = 0;
        if (nums == null || nums.length == 0) {
            return result;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            int complement = k + key;
            if (k > 0 && map.containsKey(complement)) {
                result++;
            } else if (k == 0 && value > 1) {
                result++;
            }
        }
        return result;
    }
}


