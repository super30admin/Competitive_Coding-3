# Time Complexity :
# O(n)

# Space Complexity :
# O(n)

# Did this code successfully run on Leetcode :
# YES

# Any problem you faced while coding this :
# NO


# Your code here along with comments explaining your approach

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        hm = dict()
        hs = set()
        complement = "a"
        
        # First pass to fill hash map with all values of array
        # key:value --> element:index
        for i in range(len(nums)):
            hm[nums[i]] = i
            
        # Second Pass to check if for a perticular element we have another element
        # Such that |e1-e2| = k
        for j in range(len(nums)):
            complement = hm.get(nums[j] - k, "a")
            
            # Adding to hashset to avoid duplicacy
            if (complement != "a" and complement != j):
                hs.add((nums[j], nums[complement]))
                
        return len(hs)