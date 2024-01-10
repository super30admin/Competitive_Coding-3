
#https://leetcode.com/problems/k-diff-pairs-in-an-array/

#Time comp: O(N) 
#space : O(1) 


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        left =0 
        right = 1
        result =0
        nums.sort()
        while left < len(nums) and right< len(nums):
            if nums[right] - nums[left] < k or left==right:
                right +=1
            elif  nums[right] - nums[left] > k:
                left+=1
            #this condition needs to be at last, else the left will keep 
            #incrementing and the otehr ele wont be compared w each other 

            #consider use case [1,3,1,5,1]
            elif nums[right] - nums[left] ==k:
                left +=1
                result +=1
                while (left < len(nums) and nums[left] == nums[left - 1]):
                    left += 1
            
        return result