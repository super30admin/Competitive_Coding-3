class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
#         TC--> O(n)
#         SC--->O(n)
#         ceate a hashMap
        hashMap={}
        for num in nums:
            if num in hashMap:
                hashMap[num]=hashMap[num]+1
            else:
                hashMap[num]=1
        count=0
        for num in hashMap:
            s=num+k
            if k>0 and s in hashMap:
                count=count+1
#             ncluded explict check when k==0
            elif k==0 and hashMap[s] > 1:
                count=count+1
        return count
            