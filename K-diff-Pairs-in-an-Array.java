class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int slow = 0;
        int fast = 0;
        int count = 0;
        while(fast < nums.length){
            if(slow == fast || nums[fast] - nums[slow] < k){
                fast++;
            }else if(nums[fast] - nums[slow] > k){
                slow++;
            }else if(nums[fast] - nums[slow] == k){
                count++;
                fast++;
                slow++;
                while(fast < nums.length && nums[fast] == nums[fast-1]){
                    fast++;
                }
            }
        }
        return count;
    }
}

// Time Compplexity : O(n logn)
// Space Complexity : O(1)