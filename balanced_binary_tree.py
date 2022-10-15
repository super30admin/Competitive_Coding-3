# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# TC: O(n)
# SC: O(h)
class Solution:
    def __init__(self):
        self.isValid = True

    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        if root == None:
            return True
        self.height(root)
        return self.isValid

    def height(self, node):
        if node == None:
            return -1
        lh = self.height(node.left)
        rh = self.height(node.right)
        if abs(lh-rh) > 1:
            self.isValid = False   
        return max(lh, rh) + 1
