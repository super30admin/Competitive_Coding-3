# TC-O(n)
# SC-O(n)


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        count=0
        hashmap={}
        for i in range(len(nums)):
            if nums[i] not in hashmap:
                hashmap[nums[i]]=1
            else:
                hashmap[nums[i]]+=1
        for i in range(len(nums)):
            if k==0:
                if hashmap[nums[i]]>=2:
                    count+=1
                    hashmap[nums[i]]=0
            else:
                if nums[i]-k in hashmap:
                    if hashmap[nums[i]-k]>=1:
                        hashmap[nums[i]-k]=0
                        count+=1
        return count