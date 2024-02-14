'''
TC: O(n^2)
SC: O(1)
'''
from typing import List

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = [[1]]
        for i in range(1, numRows):
            last = res[-1]
            p1 = 0
            temp = []
            while p1<=len(last)-1:
                if p1 == 0:
                    temp.append(last[p1])
                else:
                    temp.append(last[p1]+last[p1-1])
                p1 += 1
            temp.append(last[p1-1])
            res.append(temp)
        return res
s = Solution()
print(s.generate(5))
print(s.generate(15))
print(s.generate(1))