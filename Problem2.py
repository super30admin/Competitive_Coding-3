#https://leetcode.com/problems/k-diff-pairs-in-an-array/
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        # Time Complexity: O(n), two single passes over nums, each O(1) work per element
        # Space Complexity: O(n), map stores up to n entries, result stores up to n/2 pairs
        # Build a value->index map for O(1) lookups, then for each number check both
        # possible partners (num-k and num+k) to cover the absolute-difference condition,
        # storing sorted tuples in a set to automatically discard duplicate value-pairs.

        map = {}             # will store value, most recent index it appears at
        result = set()       # holds unique pairs as sorted tuples, auto-discards duplicates

        for i in range(len(nums)):       # first pass: build the value, index map
            map[nums[i]] = i             # record/overwrite this value's index

        for i in range(len(nums)):           # second pass: check both partners for each number
            second_number = nums[i] - k          # partner if nums[i] is the BIGGER of the pair
            if second_number in map and map[second_number] != i:  # exists, and isn't same index as i
                needed_pair = [nums[i], second_number]           # build the pair as a list
                needed_pair.sort()          # sort so (a,b) and (b,a) collide as the same tuple
                result.add(tuple(needed_pair))  # convert to tuple (set requires immutable items) and store

            second_number = nums[i] + k         # partner if nums[i] is the SMALLER of the pair
            if second_number in map and map[second_number] != i:    # exists, and isn't same index as i
                needed_pair = [nums[i], second_number]          # build the pair as a list
                needed_pair.sort()                  # sort so (a,b) and (b,a) collide as the same tuple
                result.add(tuple(needed_pair))          # convert to tuple and store

        return len(result)  