# // Time Complexity : O(N)
# // Space Complexity : O(N)
# // Did this code successfully run on Leetcode : YES
# // Any problem you faced while coding this : NO


# // Your code here along with comments explaining your approach
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 1:
            return [[1]]
            
        resList = []
        resList.append([1])
        resList.append([1, 1])

        for i in range(2, numRows):
            currList = [1 for _ in range(i+1)]
            prevListLen = len(resList[i-1])
            for j in range(1, prevListLen):
                left = resList[i-1][j-1]
                right = resList[i-1][j]

                currList[j] = left + right
            resList.append(currList)  
        return resList       
