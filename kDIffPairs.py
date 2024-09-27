# // Time Complexity :o(N)
# // Space Complexity : o(N)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : No
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        count = collections.Counter(nums)
        result=0
        for i in count:
            if k>0 and (i-k) in count:
                result+=1
            elif k==0 and count[i]>=2:
                result+=1
        return result