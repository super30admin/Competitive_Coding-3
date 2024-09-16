## Space Complexity -> O(N)
## Time COmplexity -> O(N)

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        from collections import Counter
        a = Counter(nums)
        counter = 0
        
        for i in a.keys():
            if k==0:
                if a[i] > 1:
                    counter+=1
            elif (i-k) in a:
                counter+=1
            else:
                pass
        return counter
        
