# TC: O(N)
# SC: O(N)
# Yes, It ran on Leetcode

class Solution(object):
    def generate(self, numRows):
        if numRows==0:  # BC
            return []
        if numRows==1:  # BC
            return [[1]]
        
        subrow = []
        List = self.generate(numRows-1)
        for i in range(numRows):    # recursion
            if i==0 or i==numRows-1:
                subrow.append(1)
            else:
                subrow.append(List[-1][i-1] + List[-1][i])
            
        List.append(subrow)
        return List