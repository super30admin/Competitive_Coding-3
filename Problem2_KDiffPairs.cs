// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class Solution {
    public int FindPairs(int[] nums, int k) {
        int count = 0;
        Array.Sort(nums); //Sort the array
        for(int i = 0; i < nums.Length; i++) {
            if(i != 0 && nums[i] == nums[i-1]) { // No need to process same number more than once 
                continue;
            }
            for(int j = i + 1; j < nums.Length; j++) {
                int diff = Math.Abs(nums[i] - nums[j]); // find the difference between ith and jth numbers
                if(diff == k) {
                    //If the difference is 'k', increment the count and move on to next ith number
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}