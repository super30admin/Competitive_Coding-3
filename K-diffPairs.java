// Time Complexity :O(NlogN)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes.
// Any problem you faced while coding this :No.


// Your code here along with comments explaining your approach

class Solution {
    public int findPairs(int[] nums, int k) {
        int left = 0;
        int right = 1;
        int count = 0;
        Arrays.sort(nums);
        while(left < nums.length && right < nums.length)
        {
            if(left == right || nums[right] - nums[left] < k)
            {
                right++;
            }
            else if(nums[right] - nums[left] > k)
            {
                left++;
            }
            else
            {
                left++;
                count++;
                while(left < nums.length && nums[left] == nums[left - 1])
                    left++;
            }
        }
        return count;
    }
}