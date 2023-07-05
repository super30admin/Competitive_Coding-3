# Time Complexity : O(n^2), n is the number of rows
# Space Complexity : O(1)

# The code ran on LeetCode

# Create a temp list for each row and update the values by taking sum of corresponding elements in previous row.

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = [[1]]

        for i in range(2, numRows+1):
            temp = [1]*(i)

            for j in range(1, i-1):
                temp[j] = res[-1][j] + res[-1][j-1]
            
            res.append(temp)
        return res
