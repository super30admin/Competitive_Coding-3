// Time Complexity : O(nlog(n)) where n = number of nodes in the tree
// Space Complexity : O(n) where n = number of nodes in the tree
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

import java.util.*;

// Definition for a binary tree node.
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

public class Problem2 {
    
    public static boolean isBalanced(TreeNode root) {
        // If root is null, the tree is balanced
        if (root == null) {
            return true;
        }
        // If height difference between left subtree and right subtree is greater than 1, the tree is not balanced
        if (Math.abs(height(root.left) - height(root.right)) > 1) {
            return false;
        }
        // Find answers for left subtree and right subtree
        boolean ansleft = isBalanced(root.left);
        boolean ansright = isBalanced(root.right);
        // If either of the answers for left subtree and right subtree is false, return false else return true
        return ansleft && ansright;
    }
    
    // Function to find height of binary tree
    private static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    } 

    public static TreeNode makeTree(Integer[] arr) {
        TreeNode[] nodes = new TreeNode[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                nodes[i] = new TreeNode(arr[i]);
            }
        }
        int count = 0;
        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i] != null) {
                int left = 2*i+1 - 2*count;
                if (left >= nodes.length) {
                    break;
                }
                nodes[i].left = nodes[left];

                int right = left+1;
                if (right >= nodes.length) {
                    break;
                }
                nodes[i].right = nodes[right];
            } else {
                count++;
            }
        }
        return nodes[0];
    }

    // Function to print the binary tree
    public static void printTree(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
          return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (curr == null) {
                res.add(null);      
            } else {
                q.add(curr.left);
                q.add(curr.right);
                res.add(curr.val);
          }
        }
        int i = res.size()-1;
        while (res.get(i) == null) {
            res.remove(i--);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Integer[] levelarr = {3,9,20,null,null,15,7};
        TreeNode root = makeTree(levelarr);
        // printTree(root);
        boolean res = isBalanced(root);
        System.out.println(res);
    }

}
