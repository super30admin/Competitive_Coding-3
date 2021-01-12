class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        dic={}
        count=0
        for num in nums:
            if num not in dic: 
                dic[num] = 1
            else: 
                dic[num] += 1
        
        if k == 0:
            for key in dic.keys():
                if dic[key] > 1: 
                    count += 1
        
    
        else:
            for key in dic.keys():
                if key + k in dic:
                    count += 1
        
        return count
    
nums=map(int,input().split())
k=int(input())    
    
