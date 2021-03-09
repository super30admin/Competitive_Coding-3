// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
  public int sumNumbers(TreeNode root) {
    return sumNodes(root, 0);
  }

  public int sumNodes(TreeNode root, int currSum) {
    if (root == null) return 0;
    currSum = currSum * 10 + root.val;
    if (root.left == null && root.right == null) return currSum;
    int leftSum = sumNodes(root.left, currSum);
    int rightSum = sumNodes(root.right, currSum);
    return leftSum + rightSum;
  }
}