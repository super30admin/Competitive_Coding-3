// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

class KdiffPairInArray{
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k < 0) return 0;
        int count = 0;
        int left = 0;
        int right = 0;
        int n = nums.length;

        Arrays.sort(nums);

        while(left<n && right<n){
            if(left != right && nums[right]-nums[left] == k) {
                count++;
                left++;
                right++;
                while(right<n && nums[right] == nums[right-1]) right++;
            }
            else if(left == right || nums[right]-nums[left] < k) right ++;
            else left++;
        }
        return count;
    }
}