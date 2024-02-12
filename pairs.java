// Time Complexity :O(n)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
class Solution {
    public int findPairs(int[] nums, int k) {
            if (nums == null || nums.length == 0 || k < 0) return 0;
        Arrays.sort(nums);
        int pair = 0;
        int i = 0, j = 1;
        while (j < nums.length) {
            int diff = nums[j] - nums[i];
            if (j <= i || diff < k) j++;
            else if ((i > 0 && nums[i] == nums[i - 1]) || diff > k) i++;
            else {
                pair++;
                i++;
            }
        }
        return pair;
    }
}