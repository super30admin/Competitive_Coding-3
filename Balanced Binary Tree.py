#// Time Complexity : O(N) 
# // Space Complexity : O(h) 
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : no because i saw the class video and then did the problem.

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:

        if root==None:
            return True

        def calcHeight(root):
            if root==None:
                return 0
            left=calcHeight(root.left)
            right=calcHeight(root.right)
            if abs(left-right)>1:
                return -1
            if left==-1 or right==-1:
                return -1
            return max(left,right)+1
        
        if calcHeight(root)==-1:
            return False
        return True
        

# Approach:
# The problem can be solved by using a recursive approach. We define a helper function calcHeight
# that calculates the height of a tree. If the tree is balanced, the height of the left and
# right subtrees will not differ by more than 1. If the height of the left or right
# subtree is -1, it means the tree is not balanced. We use this helper function to
# check if the tree is balanced.