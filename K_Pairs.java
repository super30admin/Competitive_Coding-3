// Time Complexity :O(nlogn) + O(n) where O(nlogn has more weightage) so O(nlogn)
// Space Complexity :O(1) since we are doing all our work in the same array
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int j = 1;
        int i = 0;
        int count =0;
        while(i<n && j<n){
            
            int diff = nums[j]-nums[i];
            if(diff == k){
                count++;
                i++;
                j++;
                while(i<n && j<n && nums[i]==nums[i-1] && nums[j]==nums[j-1]){
                    i++;
                    j++;
                }
            }
            else if(diff<k){
                j++;
                if(i==j){
               j++;             
            }
            }
            else if(diff>k){
                i++;
                if(i==j){
               j++;             
            }
            }
        }
        return count;
    }
}