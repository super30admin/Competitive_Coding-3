class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        #Brute Force O(n^2)
        # result = set()
        # n = len(nums)
        # for i in range(0,n):
        #     for j in range(i+1,n):
        #         if(abs(nums[i]-nums[j])==k):
        #             result.add((min(nums[i],nums[j]),max(nums[i],nums[j])))
        # return len(result)

        #Time Complexity : O(N)
        #Space Complexity : O(N)
        n = len(nums)
        result = 0
        hashmap = Counter(nums)
        for key,value in hashmap.items():
            if(k==0 and value>1):
                result+=1
            elif(k>0 and key+k in hashmap.keys()):
                result+=1
        return result

        