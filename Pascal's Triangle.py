# TC : O(n)
# SC : O(1)

class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        answer = []
        for i in range(1, numRows+1): 
            answer.append([1]*i) 
        for i in range(1,numRows):
            for j in range(1,i):
                answer[i][j] = answer[i-1][j] + answer[i-1][j-1]
                
        return answer