import {
  BinaryTree,
  constructBinaryTree,
} from "../../helpers/binary_tree_helpers";

let result: boolean = true;

class HeightResult {
  is_balanced: boolean;
  depth: number;

  constructor(is_balanced: boolean, depth: number) {
    this.is_balanced = is_balanced;
    this.depth = depth;
  }
}
// TC: O(n) SC: O(h)
function heightBalancedBinaryTree(tree: BinaryTree) {
  // Write your code here.
  let result = isHeightBalance(tree);
  return result.is_balanced;
}

function isHeightBalance(tree: BinaryTree | null): HeightResult {
  if (tree == null) return new HeightResult(true, -1);

  let left_height = isHeightBalance(tree.left);

  let right_height = isHeightBalance(tree.right);

  let diff = Math.abs(right_height.depth - left_height.depth);

  return new HeightResult(
    left_height.is_balanced && right_height.is_balanced && diff <= 1,
    Math.max(left_height.depth, right_height.depth) + 1
  );
}

describe("Is Height Balanced Tree", () => {
  it("Happy Path - Even List", () => {
    let head = constructBinaryTree({
      nodes: [
        {
          id: "1",
          left: "2",
          right: "3",
          value: 1,
          parent: null,
        },
        {
          id: "2",
          left: "4",
          right: "5",
          value: 2,
          parent: null,
        },
        {
          id: "3",
          left: null,
          right: "6",
          value: 3,
          parent: null,
        },
        { id: "4", left: null, right: null, value: 4, parent: null },
        {
          id: "5",
          left: "7",
          right: "8",
          value: 5,
          parent: null,
        },
        { id: "6", left: null, right: null, value: 6, parent: null },
        { id: "7", left: null, right: null, value: 7, parent: null },
        { id: "8", left: null, right: null, value: 8, parent: null },
      ],
      root: "1",
    });
    expect(heightBalancedBinaryTree(head!)).toStrictEqual(true);
  });
});
