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
/*
    Time Complexity : O(n)
    Space Complexity : O(n)
*/
class Solution {
    
    public class Pair{
        int height;
        boolean balanced;
    }
    
    public boolean isBalanced(TreeNode root) {
        Pair result = helper(root);
        return result.balanced;
    }
    
    private Pair helper(TreeNode node){
        if(node==null){
            Pair bpair = new Pair();
            bpair.height = -1;
            bpair.balanced = true;
            return bpair;
        }
        
        Pair lpair = helper(node.left);
        Pair rpair = helper(node.right);
        
        Pair mypair = new Pair();
        if(lpair.balanced && rpair.balanced && Math.abs(lpair.height - rpair.height) <= 1){
            mypair.balanced = true;
            mypair.height = Math.max(lpair.height, rpair.height) + 1; 
        }else{
            mypair.balanced = false;
        }
        
        return mypair;
    }
}
