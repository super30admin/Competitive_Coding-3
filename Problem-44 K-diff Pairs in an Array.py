# 532. K-diff Pairs in an Array
# https://leetcode.com/problems/k-diff-pairs-in-an-array/

# Time complexiety: O(n)
# Space complexiety: O(n)

# logic: Similar logic as 2Sum. Only thing to take care is abs of i anf k means i-k and i+k

class Solution:
    def findPairs(self, nums, k: int):
        complement_set = set()
        pair_set = set()

        for i in nums:
            if i-k in complement_set:
                if (min(i,i-k),max(i,i-k)) not in pair_set:
                    pair_set.add((min(i,i-k),max(i,i-k)))
            if i+k in complement_set:
                if (min(i,i+k),max(i,i+k)) not in pair_set:
                    pair_set.add((min(i,i+k),max(i,i+k)))
            complement_set.add(i)

        return len(pair_set)

obj = Solution()
print(obj.findPairs([3,1,4,1,5],2))
print(obj.findPairs([1,2,3,4,5],1))
print(obj.findPairs([1,3,1,5,4],0))
print(obj.findPairs([1,2,4,4,3,3,0,9,2,3],3))
print(obj.findPairs([-1,-2,-3],1))
print(obj.findPairs([6,3,5,7,2,3,3,8,2,4],2))