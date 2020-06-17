# Time Complexity : O(nlogn) + O(n) 
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
class Solution:
    def findPairs(self,nums,k):
        if not nums:
            return 0
        nums.sort()
        low = 0 
        high = 1 
        count = 0 
        while low < len(nums) and high < len(nums):
            if low == high or nums[low] + k > nums[high]:
                high += 1 
            elif nums[low] + k < nums[high]:
                low += 1 
            else:
                count += 1 
                low += 1 
                while low < len(nums) and nums[low] == nums[low-1]:
                    low += 1 
        return count
        
if __name__ == "__main__":
    s = Solution()
    nums = [3, 1, 4, 1, 5]
    k = 2 
    res = s.findPairs(nums,k)
    print(res)