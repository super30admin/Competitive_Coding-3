//time complexity: O(N logN)
//Space complexity: O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public int findPairs(int[] nums, int k) {
        //base case
        if(nums==null||nums.length==0)
            return 0;
        //sort the array
        Arrays.sort(nums);
        //initialize the pointers and the count, where pointers represent the index
        int count=0, i=0, j=1;
        //given nums[i] - nums[j] == k
        //iterate over the array
        while(i<nums.length && j<nums.length){
            //find the diff between those values
            int diff=nums[j]-nums[i];
            if(diff==k){
                //then we increment the count as 1, because i,j are a pair and also increment i and j
                count++;
                i++;
                j++;
                //to avoid the duplicate pairs
                while(j<nums.length&&nums[j]==nums[j-1]){
                    j++;
                }
            }
            else if(diff<k){
                //then we need greater value for nums[j]
                j++;
            }
            else{
                //when the diff is greater than k
                i++;
                //when the pointers come to same place
                if(j-i==0)
                    j++;
            }
        }
        return count;
    }
}