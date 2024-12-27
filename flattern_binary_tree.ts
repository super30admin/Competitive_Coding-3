import { TreeNode } from "../../helpers/binary_tree_helpers";

function flatten(root: TreeNode | null): void {
  recursion(root);
  console.log("Done");
}

function recursion(root: TreeNode | null) {
  // base

  if (root == null) {
    return;
  }

  recursion(root.left);

  let temp: TreeNode | null = root.right;
  root.right = root.left;

  let right_end: TreeNode | null = root;
  while (right_end.right != null) {
    right_end = right_end.right;
  }

  right_end.right = temp;
  root.left = null;

  recursion(root.right);
}

describe("Flattern Binary Tree", () => {
  it("Backtracking Happy Path", () => {
    let tree = new TreeNode(1);
    tree.right = new TreeNode(5);
    tree.right.right = new TreeNode(6);
    tree.left = new TreeNode(2);
    tree.left.left = new TreeNode(3);
    tree.left.right = new TreeNode(4);
    expect(flatten(tree)).toStrictEqual(tree);
  });
});
