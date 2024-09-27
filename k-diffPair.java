// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :NO
// Your code here along with comments explaining your approach
/*
 * we need to sort the array 1st to bring the array in ascending order in order to find the difference.
 * Using 2 pointer approach, we check the diff , if it is smaller or larger than k and we increment the high and low pointers, and a count variable to keep track of the number of pairs
*/
class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums.length == 0 || nums == null)
            return 0;

        Arrays.sort(nums);

        int low = 0, high = 1;
        int count = 0;
        while (low < nums.length && high < nums.length) {
            int diff = nums[high] - nums[low];

            if (diff > k) {
                low++;
            } else if (diff < k || low == high) {
                high++;
            } else {
                count++;
                high++;
                while (high < nums.length && nums[high] == nums[high - 1]) {
                    high++;
                }
            }
        }
        return count;
    }
}
