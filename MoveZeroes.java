// Time Complexity : O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Approach1: considering two pointers. the first pointer will keep track of all the zeroes. The second pointer will keep incrementing until its value at that index is non-zero.
// Once 2nd pointer is at non-zero place and first pointer is zero, the values will be swapped.

//Approach 2: A separate index is maintained wherein the non-zero value will be stored and incremented. Once the entire array is traversed once, we will have all the non-zero values at required place. 
// We now need to put zeroes at their respective places by assigning the separate index taken as 0 until end of the array length.

class Solution {
    public void moveZeroes(int[] nums) {
        // edge case
        if(nums == null || nums.length == 0) return;
        
        //Approach 1:
        // for(int i = 0, j = i; i < nums.length && j < nums.length;) {
        //     if(nums[j] != 0) {
        //         if(nums[i] == 0 && i != j) {
        //             nums[i] = nums[j];
        //             nums[j] = 0;
        //         }
        //         i++;
        //     }
        //     j++;
        // }
        
        
        // Approach 2
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        for(; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}