'''
Time Complexity: O(n^2)
Space Complexity: O(1) as we are not using any extra space apart from the result.
Run on Leetcode: YES
'''
class Solution:
    def generate(self, numRows: int) -> list[list[int]]:
        result = [[1]]
        if numRows == 1:
            return result
        for num in range(1,numRows):
            li = [1] * (num + 1)
            for index in range(1,num):
                li[index] = result[num - 1][index - 1] + result[num - 1][index]
            result.append(li)
        return result