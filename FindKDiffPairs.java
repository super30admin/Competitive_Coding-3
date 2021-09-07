// TIME: O(NlogN)
// SPACE: O(1)
// SUCCESS on LeetCode

public class FindKDiffPairs {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int start = 0;
        int end = 1;
        int count = 0;
        while (start < nums.length && end < nums.length) {
            if (start == end || nums[end] - nums[start] < k) {
                end++;
            } else if (nums[end] - nums[start] > k) {
                start++;
            } else {
                count++;
                start++;
                while (start < nums.length && nums[start] == nums[start - 1]) {
                    start++;
                }
            }
        }
        return count;
    }
}
