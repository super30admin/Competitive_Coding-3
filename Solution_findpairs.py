"""
TC= O(Nlog N)+O(N)
SC= O(1)

"""
class Solution_findpairs:
    def findPairs(self, nums: List[int], k: int) -> int:
        nums.sort()
        slow=fast=0
        count=0
        n=len(nums)
        while(slow< n and fast<n):
            print(slow,fast)
            if(fast==slow  or nums[fast]-nums[slow]<k):
                fast+=1
            elif(nums[fast]-nums[slow]>k):
                slow+=1
            else:
                count+=1
                fast+=1
                slow+=1
                print(count,slow,fast)
                while(fast<n and nums[fast]==nums[fast-1] ):
                    fast+=1
        return count
                
                