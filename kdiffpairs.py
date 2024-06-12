#https://leetcode.com/problems/k-diff-pairs-in-an-array/submissions/
#time=o(n)
#space=o(n)
class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        dict1={}
        count=0
        for i in nums:
            if i not in dict1:
                dict1[i]=1
            else:
                dict1[i]+=1
        for i in dict1:
            if i+k in dict1:
                if k==0:
                    if dict1[i]>1:
                        count+=1
                else:
                    count+=1
        return count
                    