// Time Complexity : O(nlogn)
// Space Complexity : O(1) // Both the arraylist are part of output only
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class KdiffPairsArray {
    public int findPairs(int[] nums, int k) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        Arrays.sort(nums);
        int lowPtr = 0, highPtr = 1;
        int count = 0;
        while (lowPtr < nums.length && highPtr < nums.length) {
            int diff = nums[highPtr] - nums[lowPtr];
            if (diff > k) {
                lowPtr++;
            } else if (diff < k || lowPtr == highPtr) {
                highPtr++;
            } else {
                count++;
                highPtr++;
                while (highPtr < nums.length && nums[highPtr] == nums[highPtr - 1]) {
                    highPtr++;
                }
            }
        }
        return count;
    }
}