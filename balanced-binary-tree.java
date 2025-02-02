// Time Complexity : O(N)
// Space Complexity : O(H)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// class Solution {
//     public boolean isBalanced(TreeNode root) {
//         // TC = O(N* logN)
//         // SC = O(H)
//         // null
//         if(root == null) return true;
//         if(Math.abs(height(root.left) - height(root.right)) > 1) return false;
//         return isBalanced(root.left) && isBalanced(root.right);
//     }
//     private int height(TreeNode root) {
//         // base
//         if(root == null) return 0;
//         // logic
//         return Math.max(height(root.left), height(root.right)) + 1;
//     }
// }

// Optimized - As we are calling height method at every node, we will stop calling height if at any part of subtree, unbalanced is detected & from here we return -1

class Solution {
    public boolean isBalanced(TreeNode root) {
        // TC = O(N) (if we are finding imbalance returning -1 from there on), SC = O(H)
        // null
        if(root == null) return true;
        return height(root) != -1;
    }
    private int height(TreeNode root) {
        // base
        if(root == null) return 0;
        // logic
        int left = height(root.left);
        int right = height(root.right);
        if(Math.abs(left - right) > 1) return -1;
        if(left == -1 || right == -1) return -1; // checking if any part is unbalanced, return -1 instead of calling height for that node
        return Math.max(left, right) + 1; // actual height
    }
}