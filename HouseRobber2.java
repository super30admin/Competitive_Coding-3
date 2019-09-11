/**
 * Idea is to use dynamic programming, approach is similar to house robber 1.
 * Just because of the constraint that we have, we cannot have house 0 and house n-1 in the solution at the same time as they are adjacent.
 * So the approach is to compute 2 solutions, one where we can have house 0, and other where we can have house n-1 in our solution.
 * We return the one that maximizes our gain.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n), could be reduced to constant space
 * 
 * Leetcode Result:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for House Robber II.
 * Memory Usage: 34 MB, less than 100.00% of Java online submissions for House Robber II.
 */
class Solution {
    public int rob(int[] nums) {
        // 0 houses = 0
        if(nums.length == 0) {
            return 0;
        }
        // 1 house = value
        if(nums.length == 1) {
            return nums[0];
        }
        if(nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        
        int n = nums.length;
        // promising nums[0] or nums[n-1], cant say right now
        // so do both
        // solve nums[0....n-2]
        int[] dp1 = new int[n-1];
        dp1[0] = nums[0];
        dp1[1] = Math.max(nums[1], nums[0]);
        for(int i = 2; i < n-1; i++) {
            dp1[i] = Math.max(nums[i] + dp1[i-2], dp1[i-1]);
        }
        
        // solve nums[1.....n-1]
        int[] dp2 = new int[n];
        dp2[1] = nums[1];
        dp2[2] = Math.max(nums[2], nums[1]);
        for(int i = 3; i < n; i++) {
            dp2[i] = Math.max(nums[i] + dp2[i-2], dp2[i-1]);
        }
        return Math.max(dp1[n-2], dp2[n-1]);
    }
}