# Time Complexity : 
# Space Complexity :
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :


# Your code here along with comments explaining your approach


'''
abs(a - b) = k can be
1. a - b = k ~> a = k + b
2. - (a - b) = k ~> b = k + a

Consider equation 1, We are iterating through the keys of our dictionary.
target (a) = k + key (b) 
~> only searching for the first possibility is enough because if the other possibility exists 
then a (of eq 2) will be in the keys and the we will find it when key = b.
'''
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        d = {}
        for num in nums:
            d[num] = d.get(num, 0) + 1
            
        count = 0
        
        # uniqueness is a requirement and that is handled by the fact that we are iterating over the keys of a dictionary
        # we know that the keys form a set (repets are not allowed)
        for key in d.keys():
            target = k + key 
            
            #if target is zero then we have to consider each key that has atleast two occurences. x - x = 0
            if k == 0 and d[key] >= 2:
                count += 1
            
            elif k != 0 and target in d:
                count += 1
            
            
        return count