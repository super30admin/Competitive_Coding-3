# Leetcode 532. K-diff Pairs in an Array

# Time Complexity :  O(n) where n is the size of the array

# Space Complexity : O(q) where q is the number of unique elements in the input array

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Iterate through array and store the elements and their counts in hashmap.
# Iterate through array again and if K = 0 then check if multiple instances of an element are present
# and increment count. If K > 0 and if the sum of current element and required difference exists
# in hashmap increment the count and return the count

# Your code here along with comments explaining your approach

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        hashset = dict()
        count = 0

        for i in nums:
            if i in hashset:
                hashset[i] += 1
            else:
                hashset[i] = 1

        for i in hashset:
            if k == 0:
                if hashset[i] > 1:
                    count += 1
            elif k > 0 and i+k in hashset:
                count += 1

        return count
