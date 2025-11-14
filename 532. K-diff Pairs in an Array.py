# Time: O(n^2)
# Space: O(1)

# Iterate through i and j looking for the absolute different between them which is equal to k
# check if the pair is already in the set (sort the pair as [3,1] and [1,3] can be stored seperately but are the same)
# If its not there increment the counter and add it

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        res = 0
        unique = set()
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if abs(nums[i] - nums[j]) == k:
                    pair = tuple(sorted([nums[i],nums[j]]))
                    if pair not in unique:
                        unique.add(pair)
                        res += 1

        return res

# Time: O(nlogn) + O(n) => O(nlogn)
# Space: O(1)

# Using two pointers 
# we first sort the input array
# After sorting we have a left and right pointer which start from 0 and 1 index respectively
# Checking if the val is greater or smaller than k we shift the pointers
# If it's equal we shift both the pointers
# Also check if left is equal to right as we don't want both of the pointers at the same element
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        sort = sorted(nums)
        left = 0
        right = 1
        res = 0

        while right < len(sort):
            if left == right:
                right += 1
            elif sort[right] - sort[left] < k:
                right += 1
            elif sort[right] - sort[left] > k:
                left += 1
            else:
                res += 1
                left += 1
                right += 1
                # skip duplicates for left
                while left < len(sort) and nums[left] == nums[left - 1]:
                    left += 1

        return res
    
# Time: O(n)
# Space: O(n)
# When k is 0 check if there is a number that is occuring more than 1 time using a frequency map
# add all the elemets in a set so that we have track of all the elements in nums array
# after adding we loop through the elements in the set (we don't loop on nums array as we don't want repeating elements)

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if k == 0:
            freq = Counter(nums)
            count = 0
            for v in freq.values():
                if v > 1:
                    count += 1
            return count

        seen = set(nums)
        count = 0
        for i in seen:
            if i + k in seen:
                count += 1

        return count