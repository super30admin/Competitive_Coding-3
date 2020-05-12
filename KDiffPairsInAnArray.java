// Time Complexity : O(nlog(n)) ; n - length of the array nums
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

public class KDiffPairsInAnArray {
	public int findPairs(int[] nums, int k) {

		// edge
		if (nums == null || nums.length < 2)
			return 0;

		// sort array
		Arrays.sort(nums);

		int slow = 0;
		int fast = 0;
		int arrayLength = nums.length;
		int resultCount = 0;

		while (fast < arrayLength) {

			int diff = nums[fast] - nums[slow];

			if (slow == fast || diff < k)
				fast++;
			else if (diff > k)
				slow++;
			else {
				slow++;
				fast++;
				resultCount++;
				while (fast < arrayLength && nums[fast] == nums[fast - 1])
					fast++;
			}
		}
		return resultCount;
	}
}