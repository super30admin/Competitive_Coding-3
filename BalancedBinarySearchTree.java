//Time Complexity: O(nlogn)
//Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes

public class BalancedBinarySearchTree {
    public boolean isBalanced(TreeNode root) {
        //Top-Down recursion
        if(root == null) return true;
        if(Math.abs(height(root.left) - height(root.right)) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);

    }
    public int height(TreeNode node) {
        if(node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }
}
