#106. Construct Binary Tree from Inorder and Postorder Traversal

def buildTree(self, inorder: List[int], postorder: List[int]) -> TreeNode:
        index = {val:index for index, val in enumerate(inorder)}
        preIndex = len(postorder)-1
        # postorder.reverse()
        def helper(left = 0, right = len(inorder)-1):
            nonlocal preIndex
            if left >right:
                return None
            
            rootVal = postorder[preIndex]
            preIndex-=1
            root = TreeNode(rootVal)
            id = index[rootVal]
            
            root.right = helper(id+1, right)
            root.left = helper(left, id-1)
            
            
            return root
        return helper()

#Time Complexity : o(n)
#Space Complexity : o(n)