// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No

import java.util.HashSet;

public class K_diff_Pairs {
	public int findPairs(int[] nums, int k) {
		if (k < 0) {
			return 0;
		}
		HashSet<Integer> seen = new HashSet<>();
		HashSet<Integer> used = new HashSet<>();
		int pairs = 0;
		for (int i = 0; i < nums.length; i++) {
			if (seen.contains(nums[i] - k) && !used.contains(nums[i] + (nums[i] - k))) {
				pairs++;
				used.add(nums[i] + (nums[i] - k));
			}
			if (seen.contains(nums[i] + k) && !used.contains(nums[i] + (nums[i] + k))) {
				pairs++;
				used.add(nums[i] + (nums[i] + k));
			}
			seen.add(nums[i]);
		}
		return pairs;
	}
}