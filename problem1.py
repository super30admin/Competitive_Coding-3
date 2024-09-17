#K-diff pairs
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        aux = {}
        count = 0
        for i in nums:
            if i in aux:
                aux[i]+=1
            else:
                aux[i]=1
        if k==0:
            for i in aux.values():
                if i>1:
                    count+=1
        else:
            for i in aux:
                if k+i in aux:
                    count+=1
        return count