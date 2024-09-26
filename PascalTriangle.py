# Time Complexity : O(n^2)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

# Approach is to pick elements from each previous list and add the element to the new list, first and last element 1 will appended 
# at every list.

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if(numRows==1):
            return [[1]]
        res=[[1],[1,1]]
        for i in range(2,numRows):
            j=1
            temp=[]
            temp.append(1)
            while(j<len(res[-1])):
                temp.append((res[-1][j-1]+res[-1][j]))
                j+=1
            temp.append(1)
            res.append(temp)
        return res