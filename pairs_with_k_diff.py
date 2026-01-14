"""
time - o(n)
space - o(n)
we take all the numbers and create a freq list, we then check if for each number there exists a number + k
the edge case is k = 0, we check if the freq>1 in this case to create a pair and finally update the number of pairs we find and return
"""

from typing import List


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        contents = {}
        for num in nums:
            if num not in contents:
                contents[num] = 0
            contents[num] += 1

        result = 0
        for key in contents:
            if k == 0:
                if contents[key] > 1:
                    result += 1
            else:
                if key + k in contents:
                    result += 1
        return result
