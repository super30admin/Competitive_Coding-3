"""
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.


// Time Complexity : O(N
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

"""


class Solution(object):
    def maxSubArray(self, nums: list[int]) -> int:
      for i in range(1, len(nums)):
          if nums[i-1] > 0:
              nums[i] += nums[i-1]
      return max(nums)
