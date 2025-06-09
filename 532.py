# Time: O(n)
# Space: O(n)
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        count = {}
        ans = 0
        for n in nums:
            c = count.get(n,0)
            count[n] = c +1
        
        for n in count.keys():
            required = n+k
            if k == 0:
                if count[n] > 1:
                    ans += 1
            elif required in count:
                ans += 1
        
        return ans

