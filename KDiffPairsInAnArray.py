'''
TC: O(n)
SC: O(n)
'''
from typing import List

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        valToLastIndex = {}
        for i,v in enumerate(nums):
            valToLastIndex[v] = i
        visited = set()
        count = 0
        for i,v in enumerate(nums):
            target1 = v-k
            target2 = v+k
            if (v,target1) not in visited or (target1,v) not in visited:
                if target1 in valToLastIndex and i<valToLastIndex[target1]:
                    visited.add((v,target1))
                    visited.add((target1,v))
                    count += 1
            if (v,target2) not in visited or (target2,v) not in visited:
                if target2 in valToLastIndex and i<valToLastIndex[target2]:
                    visited.add((v,target2))
                    visited.add((target2,v))
                    count += 1
        return count  
s = Solution()
print(s.findPairs([3,1,4,1,5], 2))  
print(s.findPairs([1,2,3,4,5], 1)) 
print(s.findPairs([1,3,1,5,4], 0)) 
print(s.findPairs([1,2,4,4,3,3,0,9,2,3], 3))     