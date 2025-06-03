"""
Problem: K-diff Pairs in an Array
Approach: sort the array and have two pointers run from the start of the array. when diff > k increment left pointer and when diff < k
increment right pointer. when diff == k, we found a pair and in order to avoid duplicates, increment right to the next unique element.
t.c. => O(n log n)
s.c. => O(1)
"""
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        nums.sort()
        l, r = 0, 1
        n = len(nums)
        
        res = 0
        while r < n:
            diff = abs(nums[l] - nums[r])
            if diff == k:
                res += 1
                r += 1
                while r < n and nums[r] == nums[r - 1]:
                    r += 1
            elif diff > k:
                l += 1
                if l >= r:
                    r = l + 1
            else:
                r += 1
        return res

 