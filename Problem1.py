# Time Complexity : O(n^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes.
# Any problem you faced while coding this : NA
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        results = []
        for i in range(numRows):
            if i == 0:
                results.append([1])
            elif i == 1:
                results.append([1,1])
            else:
                tempList = [0] * (i + 1)
                tempList[0] = 1
                tempList[i] = 1
                previousInsertedList = results[-1]
                for j in range(1,i):
                    tempList[j] = previousInsertedList[j] + previousInsertedList[j-1]
                results.append(tempList)
        return results
