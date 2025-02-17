// Time complexity:- O(n)
// Space complexity:- O(h)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach 
/**
 * Approach:
 * In this problem, I recursively calculate the height of each subtree of the binary tree. 
 * During the recursion, I check if the absolute difference in height between the left and right subtrees of each node is greater than 1, which would make the tree unbalanced. 
 * If any node is found unbalanced, I mark the tree as unbalanced and return the result; otherwise, I continue to compute the heights of the subtrees.
 */ 
class Solution {
    // Variable to track if tree is balanced
    boolean result = true;
    public boolean isBalanced(TreeNode root) {
        recurse(root); // Start the recursion from the root
        return result; // return the result
    }

    // helper method to calculate the height of the tree
    public int recurse(TreeNode node) {

        //base condition: if the current node is null, return height 0
        if(node == null) {
            return 0;
        }
        //recurse left subtree to get its height
        int leftH = recurse(node.left);

        //recurse right subtree to get its height
        int rightH = recurse(node.right);

        //check if the current node is not balanced
        if(Math.abs(leftH - rightH) > 1) {
            result = false;
        }
        // Return the height of the current node: 1 + the maximum height of its two subtrees
        int max = Math.max(leftH, rightH);
        return max + 1;
    }
}
