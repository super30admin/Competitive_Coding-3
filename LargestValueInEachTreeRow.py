# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def largestValues(self, root: Optional[TreeNode]) -> List[int]:
        q = deque()
        max_list = []
        if root is not None:
            q.append(root)
    

        while q:
            m = float("-inf") 
            for i in range(len(q)):
                
                node = q.popleft()
                m = max(m, node.val)
                if node.left:
                    q.append(node.left)
                if node.right:
                    q.append(node.right)
            max_list.append(m)


        return max_list