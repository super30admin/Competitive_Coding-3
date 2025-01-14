// Time Complexity : O (n)
// Space Complexity : O (n)
// Did this code successfully run on Leetcode : Yes

import java.util.HashMap;
import java.util.Map;

public class KDiffPairs {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        // build a frequency map
        for(int n: nums) {
            map.putIfAbsent(n, 0);
            map.compute(n, (_, v) -> v + 1);
        }
        // if (k > 0) then [x, x+k] will be a valid pair
        // if (k == 0) then [x, x] will be a valid pair - so we need the frequency to determine if 2 xs exist
        for (int n: map.keySet()) {
            if ((k > 0 && map.containsKey(n + k)) ||
                    (k == 0 && map.get(n) > 1)) count++;
        }
        return count;
    }
}
