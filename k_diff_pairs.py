# Time complexity : O(n)
# Space complexity : O(n)
# Leetcode : Solved and submitted

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        # Hashmpa to maintain the frequency count
        diff = {}
        
        n = len(nums)
        count = 0 # final result of k-diff pairs
        comp = 0 # to calculate the complement with respect to the value of k
        
        # traversing the list to generate the frequency count for each element
        # if element found, then increment the count, else put the element in the Hashmap with freq = 1
        for i in range(n):
            if nums[i] in diff:
                diff[nums[i]] += 1
            else:
                diff[nums[i]] = 1
        # traverse the Hashmap with respect to keys, if k == 0, then element with itself is the pair provided duplicates are there
        # else find the complement with respect to the key and k, look into Hashmap and increment the count if found, else continue for other elements
        for key in diff:
            if diff[key] > 1 and k == 0:
                count += 1
            comp = key + k
            if comp in diff and k > 0:
                count += 1
                
        return count
