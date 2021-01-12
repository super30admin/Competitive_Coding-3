class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0, slow = 0, fast = 0, n = nums.length;
        while(slow < n && fast < n){
            if(slow == fast || nums[fast] - nums[slow] < k)
                fast++;
            else if(nums[fast] - nums[slow] > k)
                slow++;
            else{
                count++; slow++; fast++;
                while(fast < n && nums[fast] == nums[fast - 1]) 
                    fast++; 
            }

        }
        return count;
    }
}
