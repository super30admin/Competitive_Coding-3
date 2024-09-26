//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public int findPairs(int[] nums, int k) {
        
        Arrays.sort(nums);
        
        int slow = 0;
        int fast = 0;
        int count = 0;
        
        while(slow < nums.length && fast < nums.length)
        {
            if(slow==fast || (nums[fast]-nums[slow]) < k)
            {
                fast++;
            }
            else if((nums[fast]-nums[slow]) > k)
            {
                slow++;
            }
            else
            {
                count++;
                fast++;
                slow++;
                
                while(fast<nums.length && nums[fast-1]==nums[fast])
                {
                    fast++;
                }
            }
        }
        
        return count;
    }
}