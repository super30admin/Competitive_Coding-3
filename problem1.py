# Time Complexity : O(n^2)
# Space Complexity : Auxilliary O(n^2)
# Did this code successfully run on Leetcode : YES

# Any problem you faced while coding this : NO
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        map = {1: [1], 2:[1,1]}

        if numRows == 1:
            return [[1]]

        if numRows == 2:
            return [[1],[1,1]]

        for i in range(3, numRows+1):
            row = []
            for j in range(i):
                if j == 0 or j == i-1:
                    row.append(1)
                else:
                    element = map[i-1][j-1] + map[i-1][j]
                    row.append(element)
            map[i] = row
        
        res = []
        for _,v in map.items():
            res.append(v)

        return res  