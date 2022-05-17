'''
Time Complexity: O(n^2)
Space Complexity: O(1)
Executed Successfully: Yes
Challenges Faced: No
'''


#CODE
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return []
        elif numRows == 1:
            return [[1]]
        elif numRows == 2:
            return [[1],[1,1]]
        
        li = [[1],[1,1]]
        
        for j in range(3,numRows+1):
            temp = [1]
            for i in range(1,j-1):
                temp.append(li[-1][i] + li[-1][i-1])
            temp.append(1)
            li.append(temp)
        return li