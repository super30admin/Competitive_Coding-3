"""
Time Complexity : O(n^2) where n is the number of elements in the input array
Space Complexity : O(n) where n is the number of pairs
Did this code successfully run on Leetcode : Time Limit Exceeded
Any problem you faced while coding this :


Your code here along with comments explaining your approach:
Loop through all the elements and insert the required pair into the set.
Everytime when we add to set increase the count and at the end return the count
"""
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        #Make a list of unique numbers
        temp = set()
        count = 0
        #Iterate through the elements and find the count
        for i in range(len(nums)):
            diff = 0
            for j in range(i+1, len(nums)):
                diff = nums[i] - nums[j]
                if abs(diff) == k and (nums[i],nums[j]) not in temp and (nums[j],nums[i]) not in temp:
                    count += 1
                    temp.add((nums[i], nums[j]))
                diff = 0
        return count