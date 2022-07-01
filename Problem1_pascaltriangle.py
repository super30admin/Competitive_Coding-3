'''
Time complexity : O(n^2)
Space Complexity : O(n)
'''

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        i = 0
        result = list()
        total = 0

        while ( i < numRows):
            temp = list()
            if i == 0:
                result.append([1])
            else:
                for j in range(i+1):
                    if (j == 0):
                        temp.append(1)
                    elif(j<i):
                        total = result[i-1][j] + result[i-1][j - 1]
                        temp.append(total)
                    else:
                        temp.append(1)
                result.append(temp)
            i += 1
        return result