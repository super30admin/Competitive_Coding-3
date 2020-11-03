# Time Complexity: O(n)
# Space: O(n)
# # Approach:
# Use a hashmap to store values of nums + k and index
# Iterate through the elements of the array, for every element check if num + k is in hashmap- 
# If it is, add it to a set (to avoid duplicates) and increment the result count

class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        hmap = collections.defaultdict(int)
        seen = set()
        res = 0
        for i, num in enumerate(nums):
            b = num + k
            hmap[b] = i
            
        for i, num in enumerate(nums):
            if num in hmap and num not in seen and hmap[num] != i:
                seen.add(num)
                res += 1
                
        return res
    
# It is possible to use a single hashmap with num+diff and count of occurances to solve this problem.
# I did not check-in this approach since I had to peek at the leetcode solution to get it.