'''
Time Complexity: O(n)
Space Complexity: O(n)
Did this code successfully run on Leetcode : Yes
Explanation: Create Hashmap of key and indexes. Create 2 complements 1) nums[i]+k and nums[i]-k check if complement in
the set which will contains our pairs, if it exists then don't add if not add the complement into the set
'''
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if k < 0:
            return 0

        res = set()
        indexMap = {}

        for i in range(0, len(nums)):
            indexMap[nums[i]] = i

        for i in range(0, len(nums)):
            complement = (nums[i] - k)
            complement1 = (nums[i] + k)
            # print(complement)
            if complement in indexMap.keys():
                if (nums[i], complement) not in res and indexMap[complement] != i:
                    temp = sorted([nums[i], complement])
                    res.add(tuple(temp))
            if complement1 in indexMap.keys():
                if (nums[i], complement1) not in res and indexMap[complement1] != i:
                    temp = sorted([nums[i], complement1])
                    res.add(tuple(temp))

        return len(res)

