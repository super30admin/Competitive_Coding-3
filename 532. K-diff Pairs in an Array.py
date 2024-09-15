# Submitted by : Aryan Singh_RN12MAY2023
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : initially was using two sets, then replaced with a single dictionary

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        # if k is negative, there can be no k-diff pairs
        if k < 0:
            return 0

        counter = 0
        dict = {}
        
        # create a dictionary to store the frequency of each number in nums
        for val in nums:
            dict[val] = dict.get(val, 0) + 1
        
        # iterate through the dictionary and check for k-diff pairs
        for val in dict:
            if k == 0:
                # if k is 0, we only count pairs with the same number
                if dict[val] > 1:
                    counter += 1
            else:
                # if k is not 0, we check if the pair (val, val+k) exists in the dictionary
                if val + k in dict:
                    counter += 1

        return counter
