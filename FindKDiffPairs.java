/**
 * Time Complexity: O(n logn) - sorting + one pass.
 * Space Complexity: O(1) - no extra space
 * Idea: 
 * 1. Sort the array
 * 2. Two pointers at start and start+1. Calculate diff and maintain a count. Track duplicates with a prev variable.
 * 3. Can skip some comparision if diff is > than k since its a sorted array. Break when start and end meet or end of array.
 */

class FindKDiffPairs {

    public int findPairs(int[] nums, int k) {
        if(nums.length < 2) return 0;
        int start = 0;
        int end = start + 1;
        int prev = Integer.MAX_VALUE;
        while(end < nums.length){
 
            while(start < end && nums[end] - nums[start] > k){
                start ++;
            }
 
            if(start != end && nums[end]-nums[start] == k){
               if( prev != nums[start]){
                    count++;
                    prev = nums[start];
               }
            }
 
            end++;
        }
 
        return count;
    }
    public static void main(String[] args){
        System.out.println("FindKDiffPairs");
    }
}