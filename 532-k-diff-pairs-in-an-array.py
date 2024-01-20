
"""
532. K-diff Pairs in an Array
Medium
"""
from leetcode_runner import LeetCode, TestCase, Args
from typing import *

PROBLEM = """
Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.
A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:

0 <= i, j < nums.length
i != j
|nums[i] - nums[j]| == k

Notice that |val| denotes the absolute value of val.
 
Example 1:

Input: nums = [3,1,4,1,5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.

Example 2:

Input: nums = [1,2,3,4,5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).

Example 3:

Input: nums = [1,3,1,5,4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).

 
Constraints:

1 <= nums.length <= 104
-107 <= nums[i] <= 107
0 <= k <= 107


"""

class Solution:
    """
    Accepted
    Time Complexity: O(n)
    Space Complexity: O(n)
    
    Explanation: We hash the values and then, we check if the target exists in the hash.
    the target here can be derived from the absolute difference between the current value and the target.
    #NOTE -> if k is the absolute difference, then, the target can be derived from the current value - k or current value + k.
        Such that, current value - target = k or current value + target = k
    """
    def findPairs(self, nums: List[int], k: int) -> int:
        res = set()
        dict = {}
        for idx, i in enumerate(nums): #frequency map
            if i in dict:
                dict[i] += 1
            else:
                dict[i] = 1
        for num in nums: # 2 conditions can be derived from the above note || checking both
            tgt1 = num - k
            tgt2 = num + k
            # print(tgt)
            if tgt1 in dict:
                if num == tgt1:
                    if dict[tgt1] <= 1: #Making sure that 1,1 is not counted twice, it has to exist twice in the array || checking in freq map
                        continue
                res.add(tuple(sorted([num, tgt1])))

            if tgt2 in dict:
                if num == tgt2:
                    if dict[tgt2] <= 1:
                        continue
                res.add(tuple(sorted([num, tgt2])))
        return len(res)
        

LeetCode(PROBLEM, Solution).check()
