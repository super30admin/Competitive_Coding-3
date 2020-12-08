// TC: 0(nlogn)
// SC: O(1)





class Solution {
    public int findPairs(int[] nums, int k) {
        
        Arrays.sort(nums);
        
        int slow = 0;
        int fast = 0;
        int count = 0;
        
        int n = nums.length;
        
        
        while(slow < n && fast < n){
            
         if(slow == fast || nums[slow] - nums[fast] < k) {
                    slow++;
                }
            
        else if(nums[slow] - nums[fast] > k) {
                fast++; 
            }            
        else{
                slow++;
                fast++;
                count++;
                
                while(fast < n && nums[fast] == nums[fast-1]){
                    fast++;
                }
                
            }
        }
        
        return count;
    }
}