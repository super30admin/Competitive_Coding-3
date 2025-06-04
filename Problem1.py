"""
Understood and implemented referring to the solution
Time Complexity: O(n)
Space Complexity: O(n)
"""
class Solution:
    def findPairs(self, nums, k):
        if k < 0:
            return 0
        elements = {} 
        for i in range(len(nums)):
            elements[nums[i]] = i
        result = set()
        
        for i in range(len(nums)):
            complement1 = nums[i] - k
            complement2 = nums[i] + k

            if complement1 in elements and elements[complement1] != i:
                pair = tuple(sorted([nums[i], complement1]))
                result.add(pair)

            if complement2 in elements and elements[complement2] != i:
                pair = tuple(sorted([nums[i], complement2]))
                result.add(pair)
        return len(result)