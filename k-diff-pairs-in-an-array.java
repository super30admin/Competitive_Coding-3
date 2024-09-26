// Time Complexity : O(nlogn) for sorting + O(n) for traversing once in while loop = O(nlogn)
// Space Complexity : O(1), no new data structure created.
// Did this code successfully run on Leetcode : Yes. Used the two pointer method. Can also be done using Hashmap

class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums.length==0 || nums== null)return 0;
        Arrays.sort(nums);
        int low =0;
        int high = low+1;
        int count = 0;
        while(low<nums.length && high<nums.length){
            if(nums[high]-nums[low]>k){
                low++;
                if(low==high){
                    high = low+1;
                }
            }
            else if(nums[high] - nums[low]<k){
                high++;
            }
            else{
                count++;
                low++;
                while(low<nums.length){
                    if(nums[low]!=nums[low-1]){
                        break;
                    }low++;
                }
                if(low>=high){
                    high=low+1;
                }
            }
        
        }
        return count;
    }
}