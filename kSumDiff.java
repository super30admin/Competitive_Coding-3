// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int count =0;
        
        int i=0; int j=1;
        while(j<n){
            int x = nums[i];int y =nums[j];
            if(Math.abs(nums[i]-nums[j])==k){
                count++;
                i++;
                j++;

            }else if(Math.abs(nums[i]-nums[j])<k){
                j++;
            }else{
                i++;
            }
            if(i==j) j++;

        }
        return count;
    }
}