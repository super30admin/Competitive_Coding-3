# Time Complexity : O(nlogn)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
class Solution:
    # def findPairs(self,nums,k):
    #     if not nums:
    #         return 0
    #     nums.sort()
    #     low = 0 
    #     high = 1 
    #     count = 0 
    #     while low < len(nums) and high < len(nums):
    #         if low == high or nums[low] + k > nums[high]:
    #             high += 1 
    #         elif nums[low] + k < nums[high]:
    #             low += 1 
    #         else:
    #             count += 1 
    #             low += 1 
    #             while low < len(nums) and nums[low] == nums[low-1]:
    #                 low += 1 
    #     return count
    
    #Time = O(n) time | O(n) space, for extra HashMap.
    def findPairs(self,nums,k):
        if not nums:
            return 0 
        if k < 0 :
            return 0 
        d = {}
        count = 0 
        for num in nums:
            if num not in d :
                if num + k in d:
                    count += 1 
                if num - k in d:
                    count += 1 
                d[num] = 1 
            else:
                if k == 0 and d[num] == 1 :
                    count += 1 
                d[num] += 1
        return count 
        
if __name__ == "__main__":
    s = Solution()
    nums = [3, 1, 4, 1, 5]
    k = 2 
    res = s.findPairs(nums,k)
    print(res)