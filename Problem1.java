// Time Complexity : O(nlogn), n is the length of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/**
 * 1. Sort the array.
 * 2. Use two pointers left and right to find the pairs with difference k.
 * 3. If the difference is less than k or left and right pointers are equal, increment right.
 * 4. If the difference is greater than k, increment left.
 * 5. If the difference is equal to k, increment left and increment count.
 * 6. Skip the duplicates.
 * 7. Return count.
 */

import java.util.Arrays;

class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = 1;
        int count = 0;

        while(left < nums.length && right < nums.length){
            if(left == right || nums[right] - nums[left] < k){
                right++;
            }else if(nums[right] - nums[left] > k){
                left++;
            }else {
                left++;
                count++;
                while(left < nums.length && nums[left] == nums[left-1])
                    left++;
            }
        }
        return count;
    }
}