# Time Complexity: O(n2)
# Space Complexity: O(1)
# Does this code run on Leetcode: Yes
# Did you face any problem while coding this: No


from typing import List


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = [[1]]
        for i in range(numRows-1):
            temp = [0] + result[-1] + [0]
            print(temp)
            row = []
            for j in range(len(result)+1):
                row.append(temp[j]+temp[j+1])
            result.append(row)
        return result
    
    