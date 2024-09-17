"""
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
// Your code here along with comments explaining your approach
Algorithm explanation
BF:
For each element, find the matching element from the remaning part of 
the array such that absolute difference is equal to k
Remove duplicates by using set as result array and add tuples (i,j) to the set
Optimal
- Use counter map to get trace of elements and frequency in the array
- ITerate over the counter map
    - If k = 0 then frequency of a given element must be greater than 1, increment count
    - If k > 0, then if the current key + k accounts for element present in the map, increment count
- Return count
"""
from collections import Counter
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        c = Counter(nums)
        count = 0
        for i in c:
            if k > 0 and i + k in c:
                #k needs to be greater than 0 and the key + k should be in count map
                count += 1
            if k == 0 and c[i] > 1:
                #if k = 0 then duplicate count needs to be omre than 1 to subtract element once
                count += 1
        return count