# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approachclass Solution:
	# run two loops one for row and one for the column
	# the length of each row changes by the row index.

    def generate(self, numRows: int) -> List[List[int]]:
        if not numRows:
            return []
        res = [[1]]
        if numRows == 1:
            return res
        
        for i in range(2,numRows+1):
            temp = [None] * i
            for j in range(0,i):
                if j == 0 or j == i-1:
                    temp[j] = 1
                else:
                    temp[j] = res[-1][j] + res[-1][j-1]
            res.append(temp)
        return res