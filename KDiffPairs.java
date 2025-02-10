// Time Complexity : O(n log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
    public int findPairs(int[] nums, int k) {

        int left = 0;
        int right = 1;
        int result = 0;

        int n = nums.length;
        Arrays.sort(nums);

        // we will use 2 pointer approach. If the difference between 2 numbers is < k we will increase the search space. If the difference > k we will decrease the search space
        //if difference between 2 numbers == k we increment count.
        while(right < n) {

            if(left == right) {
                right++;
            }
            else if(Math.abs(nums[left] - nums[right]) < k) {
                right++;
            }
            else if(Math.abs(nums[left] - nums[right]) > k) {
                left++;
            }
            else {
                left++;
                right++;
                result++;

                //edge case:- we need to make sure we don't compute same number multiple times
                while(right < n && nums[right] == nums[right - 1])
                    right++;
            }
        }
        
        return result;
    }
}