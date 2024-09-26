// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        
        int count = 0, slow = 0, fast = 0;
        
        while(slow < nums.length && fast < nums.length){
            if(slow == fast || nums[fast] - nums[slow] < k){ // If slow == fast OR different is less than k, ,mov the fast pointer
                fast++ ;
            }
            else if(nums[fast] - nums[slow] > k)    slow++; // If difference is greater than k, move the slow pointer
            else{//Otherwise, difference is k here -- > increase count and move fast - slow pointer
                count++;
                slow++; fast++;
            
                while(fast < nums.length && nums[fast] == nums[fast - 1] ){ // If previous to fast is same, move fast pointert
                    fast++;
                }//For unique pairs
            }
        }
        
        return count;
    }
}