// Time complexity - O(nlogn) 
// Space complexity - O(1)

// Two pointers approach. Start with Slow and pointers at the start and move pointers based on the difference of values.

class Solution {
    public int findPairs(int[] nums, int k) {
      int count = 0;
        int slow = 0;
        int fast = 0;
        int n = nums.length;
        Arrays.sort(nums);
        while(slow < n && fast < n){
            if(slow == fast || nums[fast] - nums[slow] < k){
                fast++;
            }
            else if(nums[fast] - nums[slow] > k){
                slow++;
            }
            else{
                count++;
                slow++;
                fast++;
                while(fast < n && nums[fast] == nums[fast-1]){
                    fast++;
                }
            }
        }
        return count;
    }
}
