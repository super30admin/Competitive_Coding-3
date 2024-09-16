// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No

//Time Complexity : O(n) since we are through the entire array 
//Space Complexity: O(1) since we are not taking any extra space 
class Solution {
    public int findPairs(int[] nums, int k) {
        
        if(nums == null || nums.length == 0 || k < 0) return 0;
        
        Arrays.sort(nums);
        
        int slow = 0;
        int fast = 1;
        int count = 0;
        int equalValueCount = 0;
        while(fast < nums.length && slow < nums.length - 1){  // [1, 1, 3, 4, 5]
            boolean isCounted = false;
            if(slow == fast){
                fast++;
            }
            
            int diff = Math.abs(nums[slow] - nums[fast]);
            
            if(nums[slow] == nums[fast])
            {
                if(diff == k && isCounted == false){
                  count++;
                  isCounted = true;
                }
                fast++;      
                continue;
            }
            
            if(diff == k && nums[fast] != nums[fast-1]){
                count++;               
                slow++;
                fast++;
            }
            else if(diff < k){
                fast++;
                isCounted = false;
            }
            else{
                slow++;
                isCounted = false;
            }            
        }
        
        return count;
    }
}