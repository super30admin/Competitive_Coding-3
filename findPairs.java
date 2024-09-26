// Time Complexity : O(N log N) 
// Space Complexity :O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int i = 0, j = 0 , count = 0;
        
       while(i< nums.length && j< nums.length){
           //case 1 : diff < k
           if(nums[j] - nums[i] < k)
               j++;
           
           //case 2 : i == j
           else if( i == j){
               j++;
           }
           
           //case 3: diff > k
           else if(nums[j] - nums[i] > k){
               i++;
           }
           //case 4: diff = k
           else {
               count++;
               i++;
               while(i < nums.length && nums[i] == nums[i-1])
                   i++;
           }
       }
        return count;
    }
}