// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
// Sort Array, used 2 pointers
// check cases diffences from the two pointer vs K
// move pointers accordingly
// Since there could be  repeated elements, move one pointer in while until 
// it is different
class Solution {
    /*
        Sort Array
        2 pointer
        A[j] - A[i]
        
        < k -> j++
        > k -> i++
        == count++ i++  j ++
    */
    public int findPairs(int[] nums, int k) {
        if(nums==null && nums.length==0 || k<0)
            return 0;
        
        int res = 0;
        int i=0,j=1;
        
        Arrays.sort(nums);
        while(i<nums.length && j<nums.length){
            int val = nums[j] - nums[i];
            if(i==j || val < k){
                j++;
            }else if(val >k){
                i++;
            }else{
                res++;
                i++;
                while(i<nums.length && nums[i-1]==nums[i]){
                    i++;
                }
            }
        }
        return res;
        
    }
}