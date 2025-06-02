class Solution:
    def findPairs(self,nums,k):
        if k<0:
            return 0
        count=0
        freq={}

        for num in nums:
            freq[num]=freq.get(num,0)+1

        if k==0:
            for val in freq.values():
                if val>1:
                    count+=1
        
        else:
            for num in freq:
                if num + k in freq:
                    count +=1

        return count
    
sol=Solution()
print(sol.findPairs(nums = [3,1,4,1,5], k = 2))
print(sol.findPairs(nums = [1,2,3,4,5], k = 1))
print(sol.findPairs(nums = [1,3,1,5,4], k = 0))