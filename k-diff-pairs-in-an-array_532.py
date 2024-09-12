 def findPairs(self, nums: List[int], k: int) -> int:
        d={}
        cnt=0
        for i in nums:
            d[i]=d.get(i,0)+1
        print(d)
        if k==0:
            for v in d.values():
                if v>1:
                    cnt+=1
        else:
            for i in d:
                if k+i in d:
                    cnt+=1
                    
        return cnt
    
    
#         nums.sort()
#         d={}
#         dup =0
#         s=set()
 
#         if k==0:
#             for i,v in enumerate(nums):
#                 if (v-k) in d: s.add((v,nums[d[v-k]]))
#                 d[v-k]=i
#             return len(s)
        
                   
#         for i,v in enumerate(nums):
#             d[v-k]=i
                
#         for i in range(len(nums)):
#             if nums[i] in d:
#                 if d[nums[i]] <len(nums) :
#                     s.add(( nums[i],nums[d[nums[i]]] ))
            
#         return len(s)
            
        