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