'''
====== Submission Details =======
Student Name: Pavan Kumar K. N.
S30 SlackID : RN32MAY2021
=================================
'''

# Given an array of integers nums and an integer k, 
# return the number of unique k-diff pairs in the array.

# A k-diff pair is an integer pair (nums[i], nums[j]), 
# where the following are true:

# 0 <= i < j < nums.length
# |nums[i] - nums[j]| == k
# Notice that |val| denotes the absolute value of val.

#-----------------
# Time Complexity: 
#-----------------
# O(NLogN): NLogN to sort, then O(N) traversal. Higher order is NLogN 

#------------------
# Space Complexity: 
#------------------
# O(1): No auxiliary data structure

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes
# Time             :  84 ms (45.41 %ile)
# Space            :  15.5 MB (89.40 %ile)

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        n = len(nums)
        if n == 0 or n==1:
            return 0
        else:
            count = 0
            nums.sort()
            curr = 0
            right = curr + 1
            # print(nums)
            while(curr < n and right < n):
                # Difference
                diff = nums[right] - nums[curr]
                
                # If current == right, then shift right
                # Or if difference is < k , shift right, find bigger element
                if curr == right or diff < k:
                    right += 1
                
                # If difference is greater than k, shift current 1 step right
                # Difference will become smaller
                elif diff > k:
                    curr += 1
                
                # Else, difference and k are equal, so increment count
                else:
                    count += 1
                    curr += 1
                    while(curr < n and nums[curr] == nums[curr-1]):
                        curr += 1
            
            return count
