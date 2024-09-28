"""
Problem: K-diff Pairs in an Array
Leetcode: https://leetcode.com/problems/k-diff-pairs-in-an-array/
Time Complexity: O(n), to create an initial frequency hash map and
        another O(N) to traverse the keys of that hash map.
Space Complexity: O(n), a hash table to count the frequency of each unique number in the input.
"""


class Solution:
    def findPairs(self, nums, k) -> int:

        # Base case
        if len(nums) is 0 or nums is None:
            return -1

        hmap = {}
        count = 0

        # Fill the hashmap with keys as unique numbers from arrays and values as count
        for num in nums:
            if num not in hmap:
                hmap[num] = 0
            hmap[num] += 1

        # Traverse through a hashmap
        for key in hmap.keys():  # 3
            # if k diffs exists
            if k > 0 and (key + k) in hmap.keys():
                count += 1
            # if k is 0 i.e. if duplicate element exists
            elif k == 0 and hmap[key] > 1:
                count += 1

        # return the number of unique k-diff pairs in the array
        return count


obj = Solution()
nums = [3,1,4,1,5]
k = 2
print(obj.findPairs(nums, k))
k = 0
print(obj.findPairs(nums, k))