"""
TC : O(N) for list traversal + O(NlogN) for sorting the list 
SC : O(1) as no extra space
"""

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        #edge case
        if k < 0 or len(nums) < 0: return 0

    
        #sorting the array is a pre-requisite
        nums.sort()
        
		#initialize variables
		#Here we use 2 pointers, p1 and p2, p1 starts at 0th location
		#p1 starts 1 step ahead of p1
        ans,p1 = 0,0
       
        p2 = p1 + 1
        
		#traverse through the length of the array
        while p1 < len(nums) and p2 < len(nums):
            if p1 == p2:
                p2 += 1
                continue
            if p1 > 0 and nums[p1] == nums[p1 - 1]:
                p1 += 1
                continue
			#declare variable diff which stores the absolute diff of two elements of the array
            diff = abs(nums[p1] - nums[p2])
           
            if diff == k: #if we found the elements having same diff as k, add ans + 1
                ans += 1
                p1 += 1 #increment pointers p1 and p2
                p2 += 1
            
            elif diff < k: #else if difference is less than k, move p2 ahead by 1
                p2 += 1
            
            else:p1 += 1 #else move pointer p1 ahead
            
        return ans