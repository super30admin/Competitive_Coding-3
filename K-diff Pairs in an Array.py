# TC : O(n)
# SC : O(n)
class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        d={}
        for n in nums:
            if n in d:
                d[n]+=1
            else:
                d[n]=1
                
                
        print(d)
        
        count=0
        if k==0:
            for nk in d:
                if d[nk]>1:
                    print(nk, count)
                    count+=1
                    
        else:
            for nk in d:
                if nk+k in d:
                    count+=1
                    
        return count