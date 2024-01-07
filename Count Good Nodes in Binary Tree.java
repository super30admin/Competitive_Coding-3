// Time Complexity : O(n)
// Space Complexity : O(n)
// Method used : DFS

class Solution {

    int count = 1;

    public int goodNodes(TreeNode root) {

        if(root == null) return count - 1;
        
        dfs(root, Integer.MIN_VALUE);

        return count - 1;
    }

    private void dfs(TreeNode root, int max)
    {
        if(root == null) return;

        if(max <= root.val)
        {
            max = root.val;
            count++;
        }

        dfs(root.left, max);
        dfs(root.right, max);
    }
}