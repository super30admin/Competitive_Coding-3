/*
Using 2 pointer approach and eliminating uniqueness with the fast pointer.
Run time is O(Nlog(n)); since we need to sort array as well as traverse through it. 
*/


class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        int count = 0;
        int slow=0,fast =0;
        int n = nums.length;
        Arrays.sort(nums);
        while(slow < n && fast < n){
            int diff = (nums[fast]-nums[slow]); 
            //case 1
            if(slow == fast || diff < k){
                fast++;
            }else if (diff > k){
                slow++;
            }else{
                count++;
                slow++;
                fast++;
                while(fast < n && (nums[fast] == nums[fast-1])) fast++;
            }
        }
        return count;
    }
}