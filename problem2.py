'''
118. Pascal's Triangle

TIME COMPLEXITY: O(numRows)
SPACE COMPLEXITY: O(numRows)
Approach: Brute Force
LEETCODE: Yes
DIFFICULTY: Nope
'''

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = [[1]]
        if numRows == 1:
            return res
        
        res = [[1], [1,1]]
        if numRows == 2:
            return res
        
        i = 2
        while i < numRows:
            temp = [0] * (i+1)
            j = 0
            temp[0] = 1
            k = i // 2 if i % 2 == 0 else ((i//2)+1)
            while j < k:
                temp[j+1] = temp[i-j-1] = res[i-1][j] + res[i-1][j+1]
                j += 1
            temp[i] = 1
            res.append(temp)
            i += 1
        
        return res
