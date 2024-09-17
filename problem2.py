class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        count = 0
        hashmap = dict()
        n = len(nums)
        i=0
        while(i<n):
            if k == 0:
                if nums[i] in hashmap.keys():
                    if hashmap[nums[i]]==1:
                        count = count + 1
                        hashmap[nums[i]]=0

                    i = i + 1

                else:
                    hashmap[nums[i]] = 1
                    i = i + 1


            else:
                if nums[i] in hashmap.keys():
                    i = i +1
                else:
                    complement1 = k+nums[i]
                    complement2 = -k + nums[i]
                    if complement1 in hashmap.keys():
                        count = count+1
                    if complement2 in hashmap.keys():
                        count =count+1
                    hashmap[nums[i]] = nums[i]
                    i = i+1


        return count

        
