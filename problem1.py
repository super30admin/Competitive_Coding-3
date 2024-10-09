# time complexity: O(n)
# space complexity: O(n)

# https://leetcode.com/problems/k-diff-pairs-in-an-array/description/

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        hmap = {}
        count = 0

        for num in nums:
            if num in hmap:
                hmap[num] += 1
            else:
                hmap[num] = 1
        
        if k < 0:
            return 0
        elif k == 0:
            for num in hmap:
                if hmap[num]>1:
                    count += 1
            return count
        else:
            for num in hmap:
                if k+num in hmap:
                    count += 1
            return count

