# Did this code successfully run on Leetcode : YES

# approach
# build frequency hashmap
# if k == 0: element should occur more than 1 time
# else: just search for 1 occurence of (element+k)
# don't search for (element-k) just because question says absolute difference -> this will cause duplicate pairs to be counted

# TC: O(N)
# SC: O(N) -> hashmap is auxilliary DS used to store freq count

from collections import Counter
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        # nums.sort()
        count = 0
        c = Counter(nums)
        for key in c:
            if k > 0:
                if c[key+k] > 0:
                    count += 1
            else:
                if c[key] >= 2:
                    count += 1
        return count