// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

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
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;

        //if height is -1 then BT is not balanced
        return (getHeight(root) != -1);
    }
    
    private int getHeight(TreeNode root) {
        if (root == null)
            return 0;
        
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        
        //compare heights of left and right subTree
        //if diff > 1 then not balanced
        if(Math.abs(left-right) > 1) return -1;

        //if subtree is not balanced, then tree not balanced
        if(left == -1 || right == -1) return -1;
        
        //else return height
        return Math.max(left,right) + 1;
    }
}