#https://leetcode.com/problems/k-diff-pairs-in-an-array/
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        nums.sort()
        final=[]
        left=0
        right=1
        
        while(left<len(nums) and right<len(nums)):
            if (left==right):
                right+=1
                continue
            if (nums[right]-nums[left])==k:
                
                final.append([nums[right],nums[left]])
                left+=1
                right+=1
                while(left<len(nums) and nums[left]==nums[left-1]):
                    left+=1
                while(right<len(nums) and nums[right]==nums[right-1]):
                    right+=1
            elif (nums[right]-nums[left])>k:
                left+=1
            else:
                right+=1
        return len(final)
        #Time O(nlogn)
        #Space O(1)/O(n)- depends on sortig algorithm
