/* The time complexity of this implementation is O(n^2) */
public class PascalTriangle {
    public static void main(String[] args) {
        PascalTriangle solution = new PascalTriangle();

        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        TreeNode root = solution.buildTree(preorder, inorder);

        System.out.println("Inorder traversal of the constructed tree:");
        solution.printInorder(root);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);

        int rootIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }

        root.left = buildTree(preorder, inorder, preStart + 1, preStart + rootIndex - inStart, inStart, rootIndex - 1);
        root.right = buildTree(preorder, inorder, preStart + rootIndex - inStart + 1, preEnd, rootIndex + 1, inEnd);

        return root;
    }

    private void printInorder(TreeNode node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.val + " ");
        printInorder(node.right);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
