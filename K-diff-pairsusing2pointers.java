class Solution {
    //TC: O(nlogn)
    //SC: O(1)
    public int findPairs(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        Arrays.sort(nums);
        if(nums == null || nums.length == 0) return 0;
        int i = 0, j = 1;
        //while(nums[j] == nums[j-1]) j++;
        while(i <= j && j < n)
        {
            int diff = nums[j] - nums[i];
            if(diff == k){
                i++;
                j++;
                count++;
                while(j < n && nums[j] == nums[j-1]) j++;
            }else if(diff  < k) {
                j++;
            }else {
                i++;
                if(i==j) j++;
                }
        } 
        return count;
    }
}