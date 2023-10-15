'''
Bottom up approach:
1. Start the DFS from root
2. At each node, check if the left and right subtree are balanced. If yes, then return the height of the subtree. If not, then return -1. 
3. It will bubble up so if any of subtree is unbalanced we would get a -1 in either left or right subtree and we can return False

TC: O(N)
SC : O(H) where H is the height of the tree - Recursive stack
'''


# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# Bottom up
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        if not root :
            return True
        return self.height(root) != -1
    
    def height(self, root: TreeNode) -> int:
        if root == None:
            return 0

        left = self.height(root.left)
        right = self.height(root.right)

        if abs(left-right) > 1:
            return -1
        if left == -1 or right == -1:
            return -1
        return max(left,right) + 1
    
'''
1. Start the DFS from root. At each node from the top calculate the height of left and right subtree.
2. If the difference is greater than 1 then return False else return the height of the subtree as (maximum of left and right subtree) + 1
3. We will bubble up the height of the subtree and check if the difference is greater than 1. If yes, then return False else return True if both left and right subtree are balanced

TC: O(N^2) since we are computing height at each node that involves traversing the subtree - O(N) and we are doing it for each node - O(N) so O(N^2)
SC : O(H) where H is the height of the tree - Recursive stack
'''

# Top Down
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        if not root :
            return True
        if abs(self.height(root.left)-self.height(root.right)) > 1:
            return False
        return self.isBalanced(root.left) and self.isBalanced(root.right) 

    def height(self, root: Optional[TreeNode]) -> int:
        if root == None:
            return 0
        left = self.height(root.left)
        right = self.height(root.right)
        if right-left > 1:
            return False
        return max(left,right) + 1