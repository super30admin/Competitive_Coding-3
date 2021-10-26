# 118. Pascal's Triangle
# https://leetcode.com/problems/pascals-triangle/

# Time complexiety: O(n*n)
# Space complexiety: O(1)

# logic: Iterate the previous row and update the temp (0 value) array with the sum of numbers in the previous row.

class Solution:
    def generate(self, numRows):
        if numRows == 1:
            return [[1]]
        elif numRows == 2:
            return [[1],[1,1]]
        else:
            res = [[1],[1,1]]
            for i in range(3,numRows):
                temp = [0 for _ in range(i)]
                temp[0], temp[-1] = 1,1
                k = 1
                for j in range(len(res[i-2])-1):
                    temp[k] = res[i-2][j-1] + res[i-2][j]
                    k += 1
                res.append(temp)
        return res

obj = Solution()
print(obj.generate(1))
print(obj.generate(2))
print(obj.generate(4))