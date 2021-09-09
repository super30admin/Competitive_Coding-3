// Time Complexity : O(n) + O(n log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int findPairs(int[] nums, int k) {
        // sort the imput array
        Arrays.sort(nums);
        // intialize slow pointer, fast pointers and count
        int slow = 0;
        int fast = 0;
        int count = 0;
        int n = nums.length;
        while(fast < n && slow < n){
            // case 1: first element or the target difference is greater than
            // difference of elements between fast pointer and slow pointer
            // increment fast pointer
            if(slow == fast || nums[fast] - nums[slow] < k) fast++;
            // case 2: diffrence betweeh element between fast and slow pointers
            // is greater than target difference
            // increment slow pointer
            else if(nums[fast] - nums[slow] > k) slow++;
            else {
                // if difference matches, increment count, slow pointer and fast pointer
                count++;
                slow++;
                fast++;
                // to get only unique pairs, keep in incrementing the fast pointer
                // until a new element is not found
                while(fast < n && nums[fast] == nums[fast - 1]) fast++;
            }
        }
        return count;
    }
}