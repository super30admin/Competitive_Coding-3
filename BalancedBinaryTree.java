// Time Complexity :O(N)
// Space Complexity :O(H)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        if(Math.abs(height(root.left)-height(root.right))>1){
            return false;
        }
        return isBalanced(root.left)&& isBalanced(root.right);
    }
    int height(TreeNode root){
        if(root==null){
            return 0;
            
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
}
