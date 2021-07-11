// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
package problem2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KDiffPairs {
	/* ------------------------------ TWO POINTERS ------------------------------ */
	// Time Complexity : O(nlogn)
	// Space Complexity : O(1)
	// Did this code successfully run on Leetcode : Yes
	// Any problem you faced while coding this : No
	public int findPairsTwoPointers(int[] nums, int k) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		Arrays.sort(nums);

		int start = 0;
		int end = 1;
		int cnt = 0;

		while (start < nums.length && end < nums.length) {
			if ((nums[end] - nums[start]) < k || start == end) {
				end++;
			} else if ((nums[end] - nums[start]) > k) {
				start++;
			} else {
				cnt++;
				start++;
				while (start < nums.length && nums[start] == nums[start - 1]) {
					start++;
				}
			}
		}

		return cnt;
	}

	/* ------------------------------ HASHING ------------------------------ */
	public int findPairs(int[] nums, int k) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
		int n = nums.length;
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0) + 1);
		}

		for (Integer key : frequencyMap.keySet()) {
			if (k > 0 && frequencyMap.containsKey(key + k)) {
				cnt++;
			} else if (k == 0 && frequencyMap.get(key) > 1) {
				cnt++;
			}
		}

		return cnt;
	}

	public static void main(String[] args) {
		KDiffPairs obj = new KDiffPairs();
		int[] nums = { 3, 1, 4, 1, 5 };
		int k = 2;
		System.out.println("Number of " + k + " diff pairs: " + obj.findPairs(nums, k));
	}

}
