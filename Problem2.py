#Time Complexity : O(N)
#Space Complexity : O(N)
#Did this code successfully run on Leetcode : YES
#Any problem you faced while coding this : NO

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        temp = Counter(nums)
        count = 0
        for i in temp:
            if k >0 and i - k in temp:
                count +=1
            elif k == 0 and temp[i] > 1:
                count +=1
        return k