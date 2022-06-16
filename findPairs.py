#Brute Force: Time Complexity: O(n log n)+O(n**2)=O(n**2)
#Space Complexity: O(n)+O(1) for sorted nums and count
def findPairs(self, nums: List[int], k: int) -> int:
        nums=sorted(nums)
        count=0
        # s=[]
        for i in range(len(nums)):
            if i>0 and nums[i]==nums[i-1]:
                continue
            for j in range(i+1,len(nums)):
                if j>i+1 and nums[j]==nums[j-1]:
                    continue
                if abs(nums[j]-nums[i])==k:
                    # if [nums[j],nums[i]] not in s:
                    #     s.append([nums[j],nums[i]])
                    count+=1
        return count

#Two Pointer Approach
#Time Complexity: O(n log n)+O(n)=O(nlogn)
#Space Complexity: O(n) for sorted nums and count
def findPairs(self, nums: List[int], k: int) -> int:
        nums=sorted(nums)
        count=0
        i=0
        j=i+1
        while i<len(nums) and j<len(nums):
            if nums[j]-nums[i]>k:
                i+=1
            elif i==j or nums[j]-nums[i]<k:
                j+=1
            else:
                i+=1
                count+=1
                while i<len(nums) and nums[i]==nums[i-1]:
                    i+=1            
        return count

