""" 
Given a binary tree, determine if it is height-balanced.

Time Complexity: O(N)
Space Complexity: O(N)
"""

def isBalanced(root):
    if not root: return True
    
    def helper(node):
        if not node: return 0
        
        leftHeight = helper(node.left)
        rightHeight = helper(node.right)
        
        if leftHeight == -1 or rightHeight == -1 or abs(leftHeight - rightHeight) > 1:
            return -1
        
        return max(leftHeight, rightHeight) + 1
    
    return helper(root) != -1