"""
Intuition: (y - x = target) 
Bring the x to the other side to get: target + x = y and check if y is in the hashmap
#####################################################################
Time Complexity : O(N) 
Space Complexity : O(N) 
#####################################################################
"""
class Solution:
    def findPairs(self, nums, k):
        result = 0
        counter = {}
        
        for num in nums:
            if num in counter:
                counter[num] += 1
            else:
                counter[num] = 1

        for x in counter:
            #target + x = y
            if k > 0 and x + k in counter:
                result += 1
            #Handles special case for unique elements eg: [1,1,1,] 
            elif k == 0 and counter[x] > 1:
                result += 1
        return result