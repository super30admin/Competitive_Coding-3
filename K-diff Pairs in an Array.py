class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        arr=dict()
        count=0
        # count1=0
        for i in range(len(nums)):
            if nums[i] not in arr:
                arr[nums[i]]=1
            else:
                arr[nums[i]]+=1
            # print(arr)
        for i in arr.keys():
            print(i)
            if k==0:
                if arr[i]>=2:
                    count+=1
            elif i-k in arr:
                # print(i)
                count+=1
        return count
            
"""Time complexity-O(n)
Space complexity-O(n)"""
                
        