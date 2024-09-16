#Time Complexity:O(n)
#Space Complexity:O(n)
class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        freq={}
        for num in nums:
            freq[num]=freq.get(num,0)+1
        count=0
        for num in freq:
            if k==0:
                if freq[num]>1:
                    count=count+1
            else:
                if num+k in freq:
                    count=count+1
        return count
