# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def treePathsSumUtil(self,root, val): 

        if root is None: 
            return 0
        val = (val*10 + root.val) 
        if root.left is None and root.right is None: 
            return val 

        return (self.treePathsSumUtil(root.left, val) + 
                self.treePathsSumUtil(root.right, val)) 
    
    def sumNumbers(self, root: TreeNode) -> int:
        if root is None:
            return 0
        if root.left is None and root.right is None:
            return root.val
        return self.treePathsSumUtil(root.left, root.val) + self.treePathsSumUtil(root.right, root.val)
    #time complexity is o(n) and space complexity is o(1)
