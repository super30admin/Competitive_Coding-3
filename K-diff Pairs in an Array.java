// Time Complexity :O(nlogn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0, r = 1;
        int count = 0;

        while (l < nums.length && r < nums.length) {
            if (l != r && nums[r] - nums[l] == k) {
                count++;
                l++;
                r++;
                while (l < nums.length && nums[l] == nums[l - 1]) l++;
                while (r < nums.length && nums[r] == nums[r - 1]) r++;
            } else if (nums[r] - nums[l] < k) {
                r++;
            } else {
                l++;
            }
        }

        return count;
    }
}
