// Time complexity is O(N)
// Space complexity is O(N) i.e HashMap values
// The solution is submitted on leetcode

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class BigN43KDiffProblem {
	public int findPairs(int[] nums, int k) {
		// edge case
		if (nums.length == 0 || nums == null || k < 0)
			return 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		HashSet<List<Integer>> result = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			Integer positiveCom = nums[i] - k;
			Integer negativeCom = nums[i] + k;
			if (map.containsKey(positiveCom) && map.get(positiveCom) != i) {
				List<Integer> temp = new ArrayList<>();
				temp.add(positiveCom);
				temp.add(nums[i]);
				Collections.sort(temp);
				if (!result.contains(temp)) {
					result.add(temp);
				}
			}
			if (map.containsKey(negativeCom) && map.get(negativeCom) != i) {
				List<Integer> temp = new ArrayList<>();
				temp.add(negativeCom);
				temp.add(nums[i]);
				Collections.sort(temp);
				if (!result.contains(temp)) {
					result.add(temp);
				}
			}
		}
		return result.size();
	}
}