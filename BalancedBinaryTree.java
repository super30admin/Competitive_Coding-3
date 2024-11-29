/*
Time Complexity:
The method height is a recursive function that visits each node once.
At each node:
    It recursively computes the height of the left and right subtrees.
    It performs constant-time checks (e.g., if conditions, Math.abs, and Math.max).
Thus, the total time complexity is O(n), where n is the number of nodes in the tree.

Space Complexity:
The space complexity is O(h), where h is the height of the tree:
    Worst Case (Skewed Tree): O(n)
    Best Case (Balanced Tree): O(logn)

Did this code successfully run on Leetcode: Yes
*/

//Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }

class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root)
    {
        if(root == null) return true;
        return height(root) != -1;
    }

    private int height(TreeNode root)
    {
        //base
        if(root == null) return 0;

        //logic
        int left = height(root.left);
        int right = height(root.right);

        if(left == -1 || right == -1) return -1;
        if(Math.abs(left-right) > 1) return -1;

        return Math.max(left, right) + 1;
    }
}
