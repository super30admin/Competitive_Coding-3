# Time Complexity : O(n^2)
# Space Complexity : O(1)

class Solution:
    def generate(numRows):
        # base
        if numRows == 0:
            return None
        
        # logic
        output = [[1]]
        for i in range(numRows - 1):
            templst = [0] + output[-1] + [0]
            innerlst = []
            for j in range(len(output[-1]) + 1):
                innerlst.append(templst[j] + templst[j + 1])
            output.append(innerlst)
            
        return output
