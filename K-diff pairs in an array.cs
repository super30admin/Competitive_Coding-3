/*
  Time complexity:O(nlogn)
  Space complexity: O(1)

  Code ran successfully on Leetcode: Yes

*/

public class Solution {
    public int FindPairs(int[] nums, int k) {
        int left = 0;
        int right = 1;
        int result = 0;

        Array.Sort(nums);
        
        while(left<nums.Length && right<nums.Length)
        {
            if(left==right || nums[right]-nums[left]<k)
            {
                right++;
            }
            else
            {
                if(nums[right]-nums[left]>k)
                {
                    left++;
                }
                else
                {
                    
                    result++;
                    
                    left++;
                    while(left<nums.Length && nums[left]==nums[left-1])
                        left++;
                }
            }
        }
        return result;
    }
}
