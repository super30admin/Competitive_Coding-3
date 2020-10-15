"""
Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.

A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:

0 <= i, j < nums.length
i != j
a <= b
b - a == k
 

Example 1:

Input: nums = [3,1,4,1,5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.
Example 2:

Input: nums = [1,2,3,4,5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
"""


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
	#Run Time Complexity: O(N)
	#Space Complexity: O(N)
        hashmap = dict()
        hashset = set()
        count = 0
        for i in range(len(nums)):
            if (nums[i]+k) in hashmap:
                if(nums[i], nums[i]+k) not in hashset: 
                    count += 1
                    hashset.add((nums[i], nums[i]+k))
                   
            if (nums[i]-k) in hashmap:
                if(nums[i]-k, nums[i]) not in hashset:
                    count+=1
                    hashset.add((nums[i]-k, nums[i]))
                    
            if nums[i] not in hashmap:
                hashmap[nums[i]] = i
        return count