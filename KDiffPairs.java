// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// I need to count the pair i, j that exists such that i-k is equal to j. So, I will create a frequency map.
// If the map contains i-k, I will increment the count. In an edge case k = 0, I will count the numbers
// that have appeared twice or more times in the array.

import java.util.HashMap;
import java.util.Map;

public class KDiffPairs {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (int num : map.keySet()) {
            if (k == 0) {
                if (map.get(num) > 1) {
                    count++;
                }
            } else {
                if (map.containsKey(num - k)) {
                    count++;
                }
            }
        }

        return count;
    }
}
