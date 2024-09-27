# brute force - sorting TC-O(nlogn)

#optimized TC-O(3n)=O(n) & SC-O(1)


class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        #if any -ve values in nums then convert it to 0 as it has no impact on the solution
        for i in range(len(nums)):
            if nums[i] < 0:
                nums[i] = 0
              
        #Traverse through nums to check val exist in the nums or not
        for i in range(len(nums)):
            val = abs(nums[i])
            if 1<= val <= len(nums):
                if nums[val - 1] >0: #val is +ve change it -ve
                    nums[val - 1] *= -1
                elif nums[val - 1] == 0: #special case if 0 then change it to (-ve *len(nums)+1)
                    nums[val - 1] = -1 * (len(nums)+1)
                    
        #for solution
        for i in range(1,len(nums)+1):
            if nums[i-1] >= 0: #if true then i is never visited smallest +ve
                return i
        
        return len(nums)+1 