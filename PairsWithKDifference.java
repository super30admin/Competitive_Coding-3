// Time Complexity :O(NlogN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int slow = 0;
        int fast = 0;
        int n = nums.length;
        int result = 0;
        while(slow < n && fast < n){
            //case1
            if(slow==fast || nums[fast]-nums[slow]<k) fast++;
            //case2
            else if(nums[fast]-nums[slow]>k) slow++;
            
            //case3
            else{
                result++;
                slow++;
                fast++;
                while(fast < n && nums[fast] == nums[fast-1]) fast++;
            }
        }
        return result;
        
    }
}
