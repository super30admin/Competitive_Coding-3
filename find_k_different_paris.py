# TC: O(n)
# SC: O(n)

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        hash1={}
        count=0
        for num in nums:
            if num in hash1:
                hash1[num]+=1
            else:
                hash1[num]=1
                
        for key in hash1:
            if k>0:
                if key+k in hash1:
                    count+=1
                else:
                    continue
            if k==0:
                if hash1[key]>1:
                    count+=1
        return count