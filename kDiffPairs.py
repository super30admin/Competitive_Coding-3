#Time: O(n)
#Space: O(n)
#Problem ran on leetcode successsfully

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        res = 0
        if k < 0:
            return res
        
        elif k == 0:
            countMap = collections.Counter(nums)
            for v in countMap.values():
                if v >= 2:
                    res += 1
            return res

        elements = set(nums)
        for num in elements:
            if num+k in elements:
                res += 1
        return res

        

