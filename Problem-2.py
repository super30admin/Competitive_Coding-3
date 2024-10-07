#Approach
# Since We need to find the absolute difference is k . if num+ target or num-target is present in the hashSet then add thenum, num-target in the resukt


#Complexities
# Time Complexity: 0(N)
# Space Complexity: O(N)




from typing import List


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        hashSet = set()
        result = set()
        for i in nums:
            if i - k in hashSet:
                if i > i - k:

                    result.add((i, i - k))
                else:
                    result.add((i - k, i))
            if i + k in hashSet:
                if i > i + k:
                    result.add((i, i + k))
                else:
                    result.add((i + k, i))
            hashSet.add(i)

        return len(set(result))