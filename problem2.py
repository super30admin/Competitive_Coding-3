# time complexity is O(1) and space complexity is O(1)
from collections import Counter
class Problem2:
    def findPairs(self, nums, k):
        counter = Counter(nums)
        result = 0
        for x in counter:
            if k>0 and x+k in counter:
                result+=1
            elif k ==0 and counter[x] > 1:
                result+=1
        return result
                
        