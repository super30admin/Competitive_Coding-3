# // Time Complexity :O(n) for freqmap and checking
# // Space Complexity :O(n) for hashmap
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach

class Solution:
    def findPairs(self, nums: list[int], k: int) -> int:
        fmap = {}
        counter = 0
        for num in nums:            # frequencymap for special case
            if num in fmap:         
                fmap[num] += 1
            else:
                fmap[num] = 1

        for key in fmap:             # traverse for pairs 
            if k == 0:               # special case for 0, 3-3-3-3 only two 3's are considered 
                if fmap[key] >1:
                    counter +=1
            else:
                if key+k in fmap:    # diff = 3; num = 1 , is 1+3 in map 
                    counter +=1

        return counter
