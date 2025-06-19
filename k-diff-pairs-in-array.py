# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : no

from collections import Counter
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if k < 0:
            return 0 
                
        count = 0
        freq = Counter(nums)

        if k == 0:
            for num in freq: 
                if freq[num] > 1:
                    count += 1
        else:
            for num in freq:
                if k + num in freq:
                    count += 1

        return count
