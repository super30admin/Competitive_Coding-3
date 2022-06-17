# Time Complexity: O(n*n)
# Space Complexity: O(1)
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result=[]
        for i in range(numRows):
            curr_row=[]
            for j in range(i+1):
                if j==0 or j==i:
                    curr_row.append(1)
                else:
                    curr_row.append(result[i-1][j-1]+result[i-1][j])
            result.append(curr_row)
        return result