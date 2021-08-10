#Leetcode Problem: 532
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        d={}
        result=0
        for i in nums:
            if i not in d:
                d[i]=0
            d[i]+=1
        for key,value in d.items():
            if k>0 and key+k in d:
                result+=1
            elif k==0 and d[key]>1:
                result+=1
        return result

#TC: O(n)
#SC: O(n)