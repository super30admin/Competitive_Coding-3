# 118. Pascal's Triangle

# Code: 

# Approach: Recursive way similar to fibonnaci series. Optimized using memoization


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        
        mapping = {}
        def helper(r,c):
            index = (r,c)
            
            if index in mapping:
                return mapping[index]
            if c==0:
                return 1
            if r==c:
                return 1
            
            left = helper(r-1,c-1)
            right = helper(r-1, c)
            
            mapping[index] = (left+right)
            
            return left+right
        
        res = []
        
        for i in range(numRows):
            local = []
            for j in range(i+1):
                local.append(helper(i,j))
            
            res.append(local)
        
        
        return res
# Time Complexity: O(N*M)
# Space Complexity: O(N)
# Accepted on Leetcode: Yes
# Difficulty faced: No