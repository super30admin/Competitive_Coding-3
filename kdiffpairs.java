// TC : O(nlogn)
// SC : O(1)

class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        
        Arrays.sort(nums); // to remove duplicates easily
        
        int left = 0;   // initialise left as first index
        int right = 1;  // initialise right as second index
        int count = 0;
        
        while(left<nums.length && right<nums.length){ // till pointer goes out of bounds
            // if less than k, then increase right to increase the difference(sorted array)
            if(left == right || nums[right]-nums[left]<k){
                right++;  
            }           
            // if greater than k, then increase left to decrease the difference(sorted array)
 
            else if(nums[right]-nums[left]>k){
                left++;
            }
            // if equal to k then increase the counter and left pointer
            else{
                count++;
                left++;
                // to remove duplicates
                while(left<nums.length && nums[left]==nums[left-1]){
                    left++;
                }
            }
        }
        return count;
    }
}