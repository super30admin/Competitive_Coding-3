// Time Complexity :O(nlogn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yess
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach:first i sort the element and then i used two-pointer approach to solve it.
class Solution {
    public int findPairs(int[] nums, int k) {
        int n= nums.length;
        Arrays.sort(nums);
        int p1=0;
        int p2=1;
        int count =0;
        while(p1<n && p2<n){
            if(Math.abs(nums[p2]-nums[p1])==k && p1!=p2){
                count++;
                p1++;
                p2++;
            while(p1<n && nums[p1]==nums[p1-1]){
                p1++;
            }  
            while(p2<n && nums[p2]==nums[p2-1]){
                p2++;
            }   
            }
            else if(nums[p2]-nums[p1]>k){
                p1++;
            }
            else{
                p2++;
            }
        }
        return count;
    }
}