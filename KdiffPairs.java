// Time Complexity : O(n)
// Space Complexity : O(n): one set and hashmap of max size n
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Create a hashmap with value to frequency. We need the frequency only for k == 0
// case as it's only a valid pair if the same element occurs twice. For all other cases,
// we can either check nums[i] - k or k + nums[i] as to form a non duplicate pair, one of them
// will always be true (for k != 0). A visited set allows us to not process the same element again.

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

class KdiffPairs {
    public int findPairs(int[] nums, int k) {
        // value to frequency
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Set<Integer> visited = new HashSet<Integer>();
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            int val = map.getOrDefault(nums[i], 0);
            map.put(nums[i], val + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited.contains(nums[i])) {
                // computed already
                continue;
            }

            // only one way look up; as if a pair exists; it will work for the other number
            // if not this
            int target = nums[i] - k;
            if (k == 0) {
                // if more than one same number; only then they can have a difference of 0
                if (map.get(nums[i]) > 1) {
                    res++;
                }
            } else {
                if (map.containsKey(target)) {
                    res++;
                }
            }
            visited.add(nums[i]);
        }
        return res;
    }
}