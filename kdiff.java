// Time Complexity : O(nlogn) because of sorting 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes


class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) return 0;
        int n = nums.length;
        int count =0;
        Arrays.sort(nums);
        int i=0;
        int j =1;
        while(j < nums.length){
            int diff = nums[j] - nums[i];
            if(j<=i ||diff<k) j++;
            else if((i>0 && nums[i] == nums[i-1]) || diff > k) i++;
            else{
                count++;
                i++;
            }
        }
      
        return count;
        
    }
}
