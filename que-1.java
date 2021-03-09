// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
//TC:O(n)
//SC:O(n)

// Your code here along with comments explaining your approach
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
    int postIdx=-1;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null || postorder == null)
            return null;
        postIdx = postorder.length-1;
        Map<Integer, Integer> map = new HashMap();
        for(int i =0; i<inorder.length; i++){
            map.put(inorder[i],i);     
        }
        return helper(inorder, postorder,0,inorder.length-1, map);
    }
    private TreeNode helper(int[] inorder, int[] postorder, int iStart, int iEnd, Map<Integer, Integer> map){
        if(postIdx<0 || iStart>iEnd)
            return null;
        int idx = map.get(postorder[postIdx]);
        TreeNode node = new TreeNode(postorder[postIdx]);
        postIdx--;
        node.right = helper(inorder, postorder,idx+1, iEnd,map);
        node.left = helper(inorder, postorder, iStart, idx-1, map);
        return node;
    }
}
