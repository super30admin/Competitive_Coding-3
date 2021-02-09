// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashMap;
import java.util.Map;

public class KDiffPairsInAnArray {
	class Solution {
		public int findPairs(int[] nums, int k) {
			if (nums == null || nums.length == 0 || k < 0)
				return 0;
			Map<Integer, Integer> map = new HashMap<>();
			int result = 0;

			for (int num : nums) {
				map.put(num, map.getOrDefault(num, 0) + 1);
			}

			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				if (k == 0) {
					if (entry.getValue() > 1)
						result += 1;
				} else {
					int num = entry.getKey() + k;
					if (map.containsKey(num))
						result += 1;
				}
			}

			return result;
		}
	}
}
