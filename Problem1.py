'''

Time Complexity : O(n^2)
Space Complexity : O(n^2)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No issues faced

Your code here along with comments explaining your approach

We look for pairs of elements in the previous row and calculate the sum accordingly 
'''

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = [[1] for i in range(numRows)]
        count = 1

        if numRows > 1:
            res[1].append(1)

        while count < numRows - 1:
            i = 0
            print(res)
            while i < len(res[count])-1:
                res[count+1].append(res[count][i] + res[count][i+1])
                i += 1
            i = 0
            res[count+1].append(1)
            count += 1

        return res