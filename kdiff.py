# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : yes

class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        frqmap={}
        c=0
        for n in nums:
            if n in frqmap:
                frqmap[n]+=1
            else:
                frqmap[n]=1
        
        for n in frqmap:
            check=n+k
            if check in frqmap:
                if k==0 and frqmap[check]>1:
                    c+=1
                elif k!=0:
                    c+=1

        return c

        