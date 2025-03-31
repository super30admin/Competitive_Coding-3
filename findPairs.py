"""
# Approach
Here we are using a hashmap to solve this problem
we have created a frequency hashmap 
If k > 0, we iterate through the frequency map and we then we check whether the sum of current number and k is in frequency map or not.
if it is present we increment the count.
if k ==0, we increment the count based on the frequency of the numbers. i.e if a number frequency is > 1, then that diff can be zero
in the end we return count

# Time complexity:O(n)

# Space complexity: O(n)

Did this code successfully run on Leetcode : Yes

Any problem you faced while coding this : No
"""

from typing import List
class Solution:
    def findpairs(self, nums:List[int], k:int) -> int:
        freq = {}
        count = 0
        for num in nums:
            if num in freq:
                freq[num] += 1
            else:
                freq[num] = 1
        if k > 0:
            for num in freq:
                if num + k in freq:
                    count += 1
        elif k == 0:
            for num in freq:
                if freq[num] > 1:
                    count += 1
        return count

sol = Solution()
nums = [3,1,4,1,5]
k = 2
print(sol.findpairs(nums,k))

