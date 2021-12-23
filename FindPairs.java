// Time Complexity :O(nlogn) //sorting the array
// Space Complexity :O(1)
// Did this code successfully run on Leetcode 532 : Yes
// Any problem you faced while coding this :2 pointer approach


class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums.length==0||nums==null)
            return 0;
        int count=0;
        Arrays.sort(nums);
        int l=0,h=nums.length-1;
        while(l<h){
            int diff=k+nums[l];
            if(diff==nums[h])
            {
                count++;
                l++;
                h=nums.length-1;
                while(l<h&&(nums[l]==nums[l-1]))
                {l++;}
            }
            else if(diff<nums[h])
            {h--;
                while(l<h && nums[h]==nums[h+1])
                {h--;
                }
             if(l==h){
                l++;
                h=nums.length-1;
                while(l<h&&(nums[l]==nums[l-1]))
                {l++;}
            }}
            else
            {
                 l++;
                h=nums.length-1;
                while(l<h&&(nums[l]==nums[l-1]))
                {l++;}
            }
        }
        return count;
    }
}