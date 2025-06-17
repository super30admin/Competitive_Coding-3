###
# Approach - To create a Pascal's triangle, I implemented two nested loops, for n = 0, there will be now rows hence we return 0.
# when n = 1 we will return only 1 row that is [1] and for n = 2 it will be [1,1], when n = 3 we will use previous row elements and add them so now the new elements will be
# 1 + 1 = 2 and on left and right padding we add one so the new level will be [1,2,1]. and when n = 4 the first three rows will be 
# [[1], [1, 1], [1, 2, 1]], new level will be two elements from previous 1+2 = 3, and 2 + 1 = 3 and the row after padding will be [1,3,3,1]

# Time complexity - O(n^2) as we are iterating over two loops
# Space complexity - O(1) there is no other extra space used other than the result
###


class Solution:
    def generate(self, numRows):
        res = [[1], [1,1]]
        if numRows == 0:
            return []
        if numRows == 1:
            return [[1]]
        if numRows == 2:
            return [[1], [1,1]]
        for i in range(2, numRows):
            newlevel = [1]
            prev_level = res[-1]
            for j in range(1, len(prev_level)):
                val = prev_level[j-1] + prev_level[j]
                newlevel.append(val)
            newlevel.append(1)
            res.append(newlevel)
        return res
    
    def main(self):
        numRows = 5
        result = self.generate(numRows)
        numRows2 = 1
        result2 = self.generate(numRows2)
        print(result)
        print(result2)


sol = Solution()
sol.main()