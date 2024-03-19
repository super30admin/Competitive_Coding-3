# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
from typing import List
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        res = {}
        count = 0

        for num in nums:
            if num in res:
                res[num] += 1
            else:
                res[num] = 1
        
        for num in res:
            if k == 0:
                if res[num] > 1:
                    count+=1
            else:
                if num + k in res:
                    count+=1
        return count

sc = Solution()
nums = [3,1,4,1,5]
k = 2
print(sc.findPairs(nums, k))
