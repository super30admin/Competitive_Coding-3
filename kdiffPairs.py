# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach: Count frequency of each number using a hashmap.
# If k > 0, for each unique number j for keys in hashmap, check whether j + k exists
# If k == 0, count numbers that appear more than once

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        get_cnt = {}
        cnt = 0
        for i in nums:
            if i in get_cnt:
                get_cnt[i] += 1
            else:
                get_cnt[i] = 1
        
        if k > 0:
            for j in get_cnt.keys():
                if k + j in get_cnt:
                    cnt += 1
        else:
            for v in get_cnt.values():
                if v > 1:
                    cnt += 1
        
        return cnt