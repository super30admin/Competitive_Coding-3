# TC: O(n^2)
# SC: O(1) // because we're returning the result array as output
# leetcode: yes
from typing import List


class Solution:
        def generate(self, numRows: int) -> List[List[int]]:
            result = []
            for i in range(numRows):
                if i == 0:
                    result.append([1])
                elif i == 1:
                    result.append([1,1])
                else:
                    insertToIndex = 1
                    result.append([1,1])
                    # iterating through previous row of the result to 
                    # calculate the values for the new row/array
                    # len(result[i-1]) - 1 is because we already have j+1
                    for j in range(len(result[i-1])-1):
                        first = result[i-1][j]
                        second = result[i-1][j+1]
                        #just to make sure the new value is int, it's not necessary
                        result[i].insert(insertToIndex, int(first+second))
                        insertToIndex += 1 
            return result