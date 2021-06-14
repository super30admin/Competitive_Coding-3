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
# O(N): 2N traversal required. One to count elements, one to check of x + k in
#       count

#------------------
# Space Complexity: 
#------------------
# O(N): Require hashmap as auxiliary data structure

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes
# Time             :  60 ms (99.85 %ile)
# Space            :  15.7 MB (50.78 %ile)

from typing import List
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        n = len(nums)
        if n == 0 or n==1:
            return 0
        else:
            count = {}
            result = 0
            # Count every element
            for num in nums:
                if num not in count:
                    count[num] = 1
                else:
                    count[num] += 1
            # print(count)

            for num in count:
                # print(num)
                if (num + k) in count:
                    if (k>0) or  (k == 0 and count[num]>1):
                        result += 1

            return result

obj = Solution()
print(obj.findPairs([1,3,1,5,4], 0))
