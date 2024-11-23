# // Time Complexity :O(n)
# // Space Complexity :O(h)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :No


# // Your code here along with comments explaining your approach

class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        # if not root:                              
        #     return True
        return self.height(root) != -1              #check height at every step 

    def height(self,root):

        if not root:                                # height is 0: at the lowest leaf
            return 0

        left = self.height(root.left)               # left height
        right = self.height(root.right)             # right height

        if abs(left - right) >1:                    # left and right not equal
            return -1       
        
        if left == -1 or right == -1:               # even 1 subtree is not balanced
            return -1
        
        return max(left,right) + 1                   #new height = maximum height(l,r) +1
