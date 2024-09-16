#118. Pascal's Triangle
"""
Time Complexity : O(n^2)
Space Complexity : O(1)
"""
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        answer = []
        for i in range(1, numRows+1): 
            answer.append([1]*i) 
        for i in range(1,numRows):
            for j in range(1,i):
                answer[i][j] = answer[i-1][j] + answer[i-1][j-1]

        return answer
