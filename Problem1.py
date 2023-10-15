'''
1. Diameter of Binary Tree is the longest path between any two nodes in a tree. This path may or may not pass through the root.
2. We can calculate the diameter of the tree by calculating the height of left and right subtree and adding them at each node.
3. If the sum of the left and right tree heights are greater than diameter then update the diameter. 

TC: O(N) 
SC : O(H) where H is the height of the tree - Recursive stack
'''


# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

#BOTTOM UP Recursion
class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:

        # If root is None then diameter is 0
        if root == None:
            return 0

        self.diameter = 0

        # Start the DFS from root
        self.dfs(root)

        return  self.diameter

    
    def dfs(self,root):

        # If root is None then return 0
        if root == None:
            return 0
        
        # Recursively call dfs on left and right. Left is the height of left subtree and right is the height of right subtree
        left = self.dfs(root.left)
        right = self.dfs(root.right)

        # Logic: If left + right is greater than diameter then update diameter
        if left + right > self.diameter:
            self.diameter = left + right
        
        # Return the maximum height of left and right and add 1 as we finished one level
        return max(left,right) + 1




        