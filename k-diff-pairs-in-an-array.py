"""

Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.

A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:

1. 0 <= i, j < nums.length
2. i != j
3. |nums[i] - nums[j]| == k
Notice that |val| denotes the absolute value of val.

Example 1:

Input: nums = [3,1,4,1,5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.

Example 2:

Input: nums = [1,2,3,4,5], k = 1
Output: 4

Example 3:

Input: nums = [1,3,1,5,4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).

Time Complexity: O(N), where N is the length of nums (constructing and iterating over the dictionary).  
Space Complexity: O(N), due to the dictionary storing unique elements of nums.  

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

"""

# Approach: 
# first counted the occurrences of each number in the array using a dictionary.  
# Then, iterated through the dictionary to check if there exists another number at a distance 'k'  
# and increment the result count accordingly based on whether k is zero or positive.  


class Solution:  
    def findPairs(self, nums: List[int], k: int) -> int:  
        count = {}  
        res = 0  

        for i in nums:  
            count[i] = 1 + count.get(i, 0)  

        for i in count:  
            if k == 0 and count[i] > 1:  
                res += 1  
            elif k > 0 and i + k in count:  
                res += 1  

        return res  
