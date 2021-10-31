# Competitive_Coding-3
# Pascal Triangle 
# Time Complexity=O(n^2)
# Space Complexity=O(n^2)

class Solution:
     def generate(self, numRows: int) -> List[List[int]]:
        if numRows   == 0: return []
        elif numRows == 1: return [[1]]
        Tri = [[1]]
        for i in range(1,numRows):
            row = [1]
            for j in range(1,i):
                row.append(Tri[i-1][j-1] + Tri[i-1][j]) 
            row.append(1)
            Tri.append(row)
        return Tri
# k-diff pairs in an array
# Time Complexity=O(n)
# Space Complexity=O(n)

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        occurences={}
        for i in nums:
            if i in occurences:
                occurences[i]+=1
            else:
                occurences[i]=1
        final=0
        for i in occurences:
            if k==0 and occurences[i]>1:
                final+=1
            elif i+k in occurences and k>0:
                final+=1
        return final
                
            