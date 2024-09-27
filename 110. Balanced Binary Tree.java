class Solution {
    // Time complexity: O(n)
    // Space complexity: O(n)
    // // top-down method
    // public boolean isBalanced(TreeNode root) {
    //     if(root == null)
    //         return true;
    //     int left = getHeight(root.left);
    //     int right = getHeight(root.right);
    //     if(Math.abs(left - right) > 1){
    //         return false;
    //     }
    //     return isBalanced(root.left) && isBalanced(root.right);
    // }
    // public int getHeight(TreeNode root){
    //     if(root == null)
    //         return 0;
    //     int left = getHeight(root.left);
    //     int right = getHeight(root.right);
    //     return Math.max(left, right) + 1;
    // }
    // bottom up method
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }
    
    public int getHeight(TreeNode root){
        if(root == null)
            return 0;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if(left == -1 || right == -1 || Math.abs(left - right) > 1)
            return -1;
        return Math.max(left, right) + 1;
    }
}