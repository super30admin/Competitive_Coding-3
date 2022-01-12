# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        hashmap = {}
        for i in range(len(nums)):
            if nums[i] in hashmap.keys():
                hashmap[nums[i]] += 1
            else:
                hashmap[nums[i]] = 1
        hashset = set()
        for i in range(len(nums)):
            comp = nums[i] - k
            if comp in hashmap.keys():
                if k == 0:
                    if hashmap[nums[i]] > 1:
                        tup = (nums[i], nums[i])
                        hashset.add(tup)
                else:
                    li = [nums[i], nums[i]-k]
                    li.sort()
                    hashset.add(tuple(li))

        return len(hashset)
