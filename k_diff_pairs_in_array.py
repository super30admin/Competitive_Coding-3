"""
Problem:
K difference pairs in array
https://leetcode.com/problems/k-diff-pairs-in-an-array/description/

Mock Interview Solutions
https://youtu.be/KTPnDMhWnoE

Time Complexity : O(n)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Your code here along with comments explaining your approach:
Trick is to store the count of the occurence of the num in a hash map and then iterate the hashmap keys and check if k is 0
then we need more than 1 element of same number so we check count > 1 and for k < 0 based on the absolute condition we check the
num + k value in the hash map.
"""

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if not nums or len(nums) == 0:
            return 0

        hash_map = {}

        for num in nums:
            hash_map[num] = hash_map.get(num, 0) + 1

        count = 0

        for num in hash_map: # traversing hash map so we don't iterate duplicates twice
            if k == 0 and hash_map[num] > 1:
                count += 1
            elif k > 0 and num + k in hash_map:
                count += 1

        return count
        

# O(nlogn)
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if not nums or len(nums) == 0:
            return 0

        nums.sort()

        left, right = 0, 1
        count = 0


        while left < len(nums) and right < len(nums):
            if left == right or nums[right] - nums[left] < k:
                right += 1
            elif nums[right] - nums[left] > k:
                left += 1
            else:
                count += 1
                left += 1
                while left < len(nums) and nums[left] == nums[left-1]:
                    left += 1

        return count
