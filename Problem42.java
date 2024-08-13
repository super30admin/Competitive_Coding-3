// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0; // k must be non-negative
        
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> uniquePairs = new HashSet<>();
        
        for (int num : nums) {
            // Check for k = 0 case
            if (k == 0) {
                if (seen.contains(num)) {
                    uniquePairs.add(num);
                }
            } else {
                // For k > 0, check if num + k is in seen
                if (seen.contains(num - k)) {
                    uniquePairs.add(num - k);
                }
                if (seen.contains(num + k)) {
                    uniquePairs.add(num);
                }
            }
            seen.add(num);
        }
        
        return uniquePairs.size();
    }
}
