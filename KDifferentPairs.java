class KDifferentPairs {

    // Time Complexity : 0(nlogn)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int low = 0;
        int high = 1;
        while(low <= high && high < nums.length){
            if(low == high){
                high++;
                continue;
            }
            int diff = nums[high] - nums [low];
            if(diff == k){
                count ++;
                low++;
                high++;
                while(high < nums.length && nums[high] == nums[high-1] ){
                    high++;
                }
            }
            else if(diff < k){
                high++;
            }
            else{
                low ++;
            }
        }
        return count;
    }
}