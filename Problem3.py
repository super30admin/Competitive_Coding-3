# Time Complexity : O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :Yes
# Any problem you faced while coding this :





# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isValidBST(self, root):

        def checker(node, left=float('-inf'), right=float('inf')):
            if node:
                if node.val <= left or node.val >= right:
                    return False
                else:
                    l = checker(node.left, left, node.val)
                    r = checker(node.right, node.val, right)
                    return l and r
            else:
                return True
        return checker(root)
