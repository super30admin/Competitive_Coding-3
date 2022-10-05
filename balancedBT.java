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

// Approach - 1
class Solution {
    public boolean isBalanced(TreeNode root) {
        // T.C: O(n)
        // Executed
        if (root == null)
            return true;
        if(Math.abs(height(root.left) - height(root.right)) > 1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    private int height(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}

// Approach - 2
class Solution {
    public boolean isBalanced(TreeNode root) {
        // T.C: O(n)
        // Executed
        if (root == null)
            return true;
        return height(root) != -1;
    }
    
    private int height(TreeNode root) {
        // base
        if (root == null)
            return 0;
        // logic
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) > 1)
            return -1;
        if (left == -1 || right == -1)
            return -1;
        return Math.max(left, right) + 1;
    }
}