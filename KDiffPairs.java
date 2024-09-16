/** 
 * Time Complexity : O(nlogn)
 * Space Complexity : O(1)
 * Leetcode : Y (https://leetcode.com/problems/k-diff-pairs-in-an-array/)
 * Approach:
        Insight: Since the array is sorted, incrementing slow pointer and not moving fast pointer will decrease the difference between nums[fast] and slow, incrementing fast pointer and not moving slow pointer will increase the difference between nums[fast] and nums[slow]
        Sort the array and use the two-pointer technique
        have two pointers-slow, fast pointing to beginning of the array
        Increment slow pointer if the difference between nums[fast] and nums[slow] is more than k
        Increment fast pointer if slow and fast are at same index or the difference between nums[fast] and nums[slow] is less than k
        Increment count, slow, fast when you find a valid k-diff pair and to ensure uniqueness of pairs, increment fast till you reach a different number
 */
class Solution {
    public int findPairs(int[] nums, int k) {
        // Check if k is valid
        if(k < 0) {
            return 0;
        }
        // Initialize count to 0
        int count = 0;
        // Sort the array in increasing order
        Arrays.sort(nums);
        // Initialize slow and fast pointers
        int slow = 0, fast = 0;
        // Traverse through the array until slow, fast are valid
        while(slow < nums.length && fast < nums.length) {
            // if slow and fast point to same index or the difference between nums[fast] and nums[slow] is less than k, so increase the difference
            if(slow == fast || nums[fast] - nums[slow] < k) {
                fast++;
            }
            // if the difference between nums[fast] and nums[slow] is more than k, so decrease the diffeerence
            else if(nums[fast] - nums[slow] > k) {
                slow++;
            }
            // if ( nums[slow], nums[fast] ) is a valid k-diff pair
            else {
                // update count
                count++;
                
                // update slow and fast
                slow++;
                fast++;
                
                // skip all the possible duplicate pairs to ensure uniqueness
                while(fast < nums.length && nums[fast] == nums[fast - 1]) {
                    fast++;
                }
            }
        }
        
        return count;
    }
}
