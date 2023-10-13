# https://leetcode.com/problems/pascals-triangle/
# // Time Complexity : O(n2)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
class Solution:
    def generate(self, numRows):
        result = [[1]]
        if numRows == 1:
            return result
        for i in range(1, numRows):  # 1
            li = []
            for j in range(i + 1):
                if j == 0:
                    li.append(result[i - 1][j])
                elif j == i:
                    li.append(result[i - 1][j - 1])
                else:
                    li.append(result[i - 1][j] + result[i-1][j - 1])
            result.append(li)
        return result


sol = Solution()
print(sol.generate(5))
