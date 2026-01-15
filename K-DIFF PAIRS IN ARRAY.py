class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        map=set()
        result=set()


        for i in range(len(nums)):
            if nums[i]-k in map:
                result.add(tuple([min(nums[i],nums[i]-k),max(nums[i],nums[i]-k)]))
            if nums[i]+k in map:
                result.add(tuple([min(nums[i],nums[i]+k),max(nums[i],nums[i]+k)]))
            map.add(nums[i])
        print(result)
        return len(result)
