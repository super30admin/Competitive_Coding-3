/**
 * # Time complexity: O(n), where n is the number of nodes in the tree, as each node is visited once.
 * # Space complexity: O(h), where h is the height of the tree, due to the recursion stack.
 * # Leetcode: Yes
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkBalance(root) != -1;
    }

    private int checkBalance(TreeNode root) {
        // Base
        if (root == null) {
            return 0;
        }

        int leftHeight = checkBalance(root.left);
        int rightHeight = checkBalance(root.right);

        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
}