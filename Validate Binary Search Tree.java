/*
Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
 

Example 1:

    2
   / \
  1   3

Input: [2,1,3]
Output: true
Example 2:

    5
   / \
  1   4
     / \
    3   6

Input: [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.
*/


// Recursive Solution
// Beats 40% of Leet code submissions

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    Integer last_printed = null;
    
    public boolean isValidBST(TreeNode root) {
        
        
        return checkBST(root);
    }
    
    boolean checkBST(TreeNode node){
        
        if(node == null)    return true;
        
        if(!checkBST(node.left)) return false;
        
        if(last_printed != null && (node.val <= last_printed)) return false;
        
        last_printed = node.val;
        
        if(!checkBST(node.right))   return false;
        
        return true;
    }
}


// Faster Solution
// Beats 100 % of Leet code submissions

class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root==null)
            return true;
        long mini = Long.MIN_VALUE;
        long maxi = Long.MAX_VALUE;
        return isValid(root,mini,maxi);
        
    }
    public boolean isValid(TreeNode root, long mini, long maxi) {

        if(root.val >= maxi || root.val <=mini)
            return false;
        boolean a = true;
        boolean b = true;
        if(root.left != null) {
            a = isValid(root.left, mini,root.val);
        }
        if(root.right != null) {
            b = isValid(root.right,root.val,maxi);
        }
        return a && b;
    }
}

// Using Stack to find the inroder to validate the binary search tree; Iterative Solutionb using Inorder

public boolean isValidBST(TreeNode root) {
   if (root == null) return true;
   Stack<TreeNode> stack = new Stack<>();
   TreeNode pre = null;
   while (root != null || !stack.isEmpty()) {
      while (root != null) {
         stack.push(root);
         root = root.left;
      }
      root = stack.pop();
      if(pre != null && root.val <= pre.val) return false;
      pre = root;
      root = root.right;
   }
   return true;
}


// Here's an iterative version that works for duplicate values. (Below, duplicate values must be on the left side of a node. If it needs to be on right side, then just switch the > and >= signs.

class Solution {
   public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode prev = null;
        boolean onRightSideOfPrev = false;
        while(root != null || !stack.isEmpty()) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(prev != null && ((!onRightSideOfPrev && prev.val > root.val) || (onRightSideOfPrev && prev.val >= root.val))) {
                return false;
            }
            prev = root;
            root = root.right;
            onRightSideOfPrev = root == null ? false : true;
        }
        return true;
    }
}