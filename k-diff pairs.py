# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        # creates a frequency hashmap
        c = Counter(nums)
        res = 0
        
        # iterates through the hashmap
        for x in c:
            
            # if complement exists increment count
           if k>0 and x+k in c:
                res+= 1
            
            # edge case where all elements are same
            elif k == 0 and c[x] > 1:
                res += 1
                
        return res