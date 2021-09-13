
//532. K-diff Pairs in an Array
// https://leetcode.com/problems/k-diff-pairs-in-an-array/
// Time Complexity : O(nlogn) where N is the size of nums

// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

class Solution {
    public int findPairs(int[] nums, int k) {
    if (nums == null || nums.length == 0 || k < 0) {
        return 0;
    }
    Arrays.sort(nums);
    int count = 0;
    int start = 0, end = 0;
    while (end < nums.length) {
        if (start == end) {
            end++;
        } else if (nums[start] + k == nums[end]) {
            count++;
            while (end + 1 < nums.length && nums[end] == nums[end + 1]) {
                end++;
            }
            end++;
        } else if (nums[start] + k < nums[end]) {
            start++;
        } else if (nums[start] + k > nums[end]) {
            end++;
        }
    }
    return count;
}
}