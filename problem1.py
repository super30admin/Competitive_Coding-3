# Time Complexity : O(n^2)
# Space Complexity : O(n^2)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :


# Your code here along with comments explaining your approach

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = []
        for i in range(1, numRows+1):
            if i == 1:
                res.append([1])
                continue
                
            temp = [0 for _ in range(i)]
            temp[0] = 1
            temp[-1] = 1
            for j in range(1,i-1):
                temp[j] = res[-1][j] + res[-1][j-1]
            res.append(temp)
        return res