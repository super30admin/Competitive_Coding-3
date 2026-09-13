# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
class Solution:
    def findPairs(self, nums, k):
        map = {}
        count = 0
        for i in nums:
            map[i] = map.get(i, 0) + 1

        for num in map:
            frq = map[num]
            if k == 0:
                if frq >= 2:
                    count += 1
            else:
                if num - k in map:
                    count += 1
        return count
