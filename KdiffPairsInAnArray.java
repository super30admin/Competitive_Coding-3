// Time Complexity: O(n log n)
//   - Sorting the array takes O(n log n)
//   - For each element, we perform a binary search (O(log n))
//   => total O(n log n)
// Space Complexity: O(1) - Binary search is done in-place without additional data structures
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No

// Your code here along with comments explaining your approach:
// - First, sort the array to enable binary search and easy duplicate handling.
// - Iterate through each element (index j):
//     - Skip duplicates to ensure uniqueness in counting.
//     - For each element nums[j], calculate its complement (nums[j] + k).
//     - Use binary search to check if this complement exists in the rest of the array (j+1 to end).
//     - If found, increment the count.
// - Return the final count of unique k-diff pairs.

class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        Arrays.sort(nums);

        for(int j = 0; j<nums.length;j++){
            // Skip duplicates
            if (j > 0 && nums[j] == nums[j - 1]) {
                continue;
            }
            //Search complement in array
            //If found increment the count
            if(search(nums, k+nums[j], j)) count++;
        }
        return count;
    }

    //Binary Search
    public boolean search(int[] nums, int target, int j){
        int low = j+1;
        int high = nums.length-1;
        while(low<= high){
            int mid = low + (high- low)/2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[mid] > target){
                high = mid -1;
            } else{
                low = mid +1;
            }
        }
        return false;
    }
}