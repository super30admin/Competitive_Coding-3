"""
    Problem : K-diff Pairs in an Array

    Student : Shahreen Shahjahan Psyche
    Time Complexity :
    Space Complexity : 

"""

from typing import List

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        # edge case
        if not nums or len(nums) < 2:
            return 0

        # Sorting the array, as I will implement 2 pointers
        nums = sorted(nums) # O(N log N)
        
        i = 0
        j = 1
        count = 0
        
        while(j < len(nums)): 

            # if my i and j is pointing to the same element, I am increasing j
            if i == j:
                j += 1
                continue 
            # print(i,j)
            differ = nums[j] - nums[i]

            # if the difference is less than target, then increasing j
            if differ < k:
                j += 1
                continue
            # if differencee is greater than k then increasing i
            elif differ > k:
                i += 1
                continue
            else:
                count += 1
                j += 1
                i += 1
                # to retain uniqueness 
                while(j<len(nums) and nums[j] == nums[j-1]):
                    j+=1
    
        
        return count
            