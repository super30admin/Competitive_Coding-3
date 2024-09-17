# Time Complexity : O(k*k!)
# Space Complexity :O(k)
# Did this code successfully run on Leetcode :Yes
# Any problem you faced while coding this :


class Solution(object):
    def getRow(self, rowIndex):
        if rowIndex == 0:
            return [1]
        if rowIndex == 1:
            return [1, 1]
        else:
            curr = [1, 1]
            temp = []
            cntr = 2
            while cntr <= rowIndex:
                for i in range(cntr):
                    if i == 0:
                        temp.append(1)
                        temp.append(curr[i] + curr[i + 1])
                    elif i == cntr - 1:
                        temp.append(1)
                    else:
                        temp.append(curr[i] + curr[i + 1])
                curr = temp
                temp = []
                cntr += 1
            return curr

