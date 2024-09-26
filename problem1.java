public class problem1 {
    public int findPairs(int[] nums, int k) {
        // Time Complexity : O(n logn)
        // Space Complexity : O(1)
        // Did this code successfully run on Leetcode : Yes
        // Any problem you faced while coding this : No
        
        if(nums == null || nums.length < 2 || k < 0) return 0;
        
        Arrays.sort(nums);
        
        int n = nums.length;
        int i = 0;
        int j = 1;
        int count = 0;
        
        while( i<n && j<n){
            while( i-1 >= 0 && nums[i] == nums[i-1] && i < j-1 ){
                i++;
            }
            while( j+1 < n && nums[j] == nums[j+1]){
                j++;
            }
            if(nums[j]-nums[i] == k){
                count++;
                i++;
                j++;
            }else if(nums[j]-nums[i] < k){
                j++;
            }else{
                i++;
            }
            if(i == j){
                j++;
            }
        }
        return count;
    }
}
