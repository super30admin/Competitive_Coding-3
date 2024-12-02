'''
Time: O(n)
Space: O(n)
'''
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        hashMap={}
        for i in nums:
            if i in hashMap:
                hashMap[i]+=1
            else:
                hashMap[i]=1
        
        res=0
        for num in hashMap.keys():
            if k>0:
                diff=num+k
                if diff in hashMap:
                    res+=1
                
            #elif k==0: as k can never be negative
            else:
                if hashMap[num]>1:
                    res+=1
        return res
                