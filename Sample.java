//Time Complexity: O(NlogN);
//Space Complexity : O(1);



class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null && nums.length == 0)
            return 0;
        if(k<0)
            return 0;
        Arrays.sort(nums);
        int start = 0;
        int end = 1;
        int n = nums.length;
        int x = Integer.MIN_VALUE;
        int y = Integer.MIN_VALUE;
        int count = 0;
        while(end<n){
            int diff = nums[end] - nums[start];
            if(diff == k && start != end && (x!=nums[start] && y!=nums[end])){
                count++;
                x = nums[start];
                y = nums[end];
                end++;

            }
            else if(diff>k)
                start++;
            else
                end++;
        }
        return count;

    }
}