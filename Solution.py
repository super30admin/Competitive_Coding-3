#Time Complexity :O(n^2)
#Space Complexity : O(n)
#Did this code successfully run on Leetcode : Yes   
#Any problem you faced while coding this : None


#Your code here along with comments explaining your approach: Created a new array having the same size as the original. Hard coded the output for the 1st and 2nd row. For the remaining rows found the values by adding the numbers in the previous list. 

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = [[] for _ in range(numRows)]
        for i in range(numRows):
            if i == 0:
                result[i].append(1)
            elif i == 1:
                result[i].append(1)
                result[i].append(1)
            else:
                result[i].append(1)
                for j in range(0, i - 1):
                    result[i].append(result[i - 1][j] + result[i - 1][ j + 1])
                result[i].append(1)
        
        return result