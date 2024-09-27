"""
Time Complexity :
Space Complexity :
Did this code successfully run on Leetcode :
Any problem you faced while coding this :
Problem_2: K-diff Pairs in an Array, Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.
A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:
0 <= i, j < nums.length
i != j
nums[i] - nums[j] == k
Notice that |val| denotes the absolute value of val.
"""
# Approach - 1
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        """
        using two pointers(l,r) to iterate through the list. r will be one step ahead l. If the diff between 
        elements at l and r is equal to k then increment l and result by one. Else increment r.
        Time Complexity : O(N) N is the number of elements in the list
        Space Complexity : O(1)
        
        """
        nums = sorted(nums)
        l = 0
        r = 1
        res = 0
        
        while l< len(nums) and r < len(nums):
            if nums[r] - nums[l] == k:
                l += 1
                res += 1
                while l < len(nums) and nums[l] == nums[l - 1]:
                    l += 1
                
            elif l==r or nums[r] - nums[l] < k:
                r +=1
            else:
                l += 1
            
                    
        return res

# Approach - 2
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        """
        Using Hash map to store frequency of each element.
        If the element + k is in the list then increment result by 1
        Time Complexity : O(N)
        sapce Complexity : O(N)
        """
        if len(nums) == 0: return 0
        
        fre_map = {}
        res= 0
        
        for i in range(len(nums)):
            if nums[i] in fre_map:
                fre_map[nums[i]] += 1
            else:
                fre_map[nums[i]] = 1
                
                  
        for  keys in fre_map:
            if k >0 and keys + k in fre_map:
                res += 1
            elif k == 0 and fre_map[keys] > 1:
                res +=1
                
        return res