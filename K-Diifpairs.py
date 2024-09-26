'''
time complexity: O(n)
space complexity: O(n)
as we are using extra space for hashmap
'''
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        count = Counter(nums)
        ans = 0
        for n in count:
            if k > 0 and n+k in count:
               ans+=1
            elif k==0 and count[n] > 1:
                ans+=1
        return ans
        