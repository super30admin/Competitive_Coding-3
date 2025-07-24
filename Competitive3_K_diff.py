# Time Complexity : It is O(n), actually it is O92n) since we iterating twice but 2 is constant.
# Space Complexity : It is O(n) since are creating the hash map.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
from collections import Counter

from typing import List

class Solution:
        def findPairs(self, nums: List[int], k: int) -> int:
            
            countOfDigits = {}
            numberOfOccurance=0
            for i in nums:
                if i in  countOfDigits:
                    countOfDigits[i] = countOfDigits[i] +1
                else:
                    countOfDigits[i]=1
            for key in countOfDigits:                
                if key + k in countOfDigits:
                    if (k ==0 and countOfDigits[ key + k]>1) or k >0:                       
                        numberOfOccurance +=1
            return numberOfOccurance
        

obj = Solution()
print(obj.findPairs([1,3,1,5,4],0))
print(obj.findPairs([3,1,4,1,5],2))