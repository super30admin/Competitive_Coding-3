#hashmap
#Count how many times each number appears using a map.
#If k is zero, we look for duplicates (numbers with frequency ≥ 2).
#If k is not zero, check if the complement num - k exists to form a valid pair.
#Time Complexity:O(n)
#Space Complexity:O(n)

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
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

        

# #brute force
# class Solution:
#     def findPairs(self, nums: List[int], k: int) -> int:
#         n = len(nums)
#         result = set()  # To store unique k-diff pairs (in sorted order)
#         # Brute-force approach: check every pair (i, j) where i < j
#         for i in range(n):
#             for j in range(i + 1, n):
#                 # Check if absolute difference is exactly k
#                 if abs(nums[i] - nums[j]) == k:
#                     # Add the pair in (min, max) order to avoid duplicates
#                     if nums[i] < nums[j]:
#                         result.add((nums[i], nums[j]))
#                     else:
#                         result.add((nums[j], nums[i]))
#         return len(result)  # Return the count of unique k-diff pairs