#Two Pointers solution
class Solution:
    #O(Nlogn) - Time complexity ; O(n) - Space complexity
    def findPairs(self, nums: List[int], k: int) -> int:
        nums = sorted(nums)
        
        left = 0
        right = 1
        
        res = 0
        
        while left < len(nums) and right < len(nums):
            if (left == right or nums[right] - nums[left] < k):
                right += 1
            elif nums[right] -nums[left] > k:
                left += 1
            else:
                left += 1
                res += 1
                while (left <len(nums) and nums[left] == nums[left - 1]):
                    left += 1
        return res
            
        
        





#Brute Force Solution 
class Solution:
    #O(N^2) - Time complexity. For sorting  the array it takes 0(Nlogn) and loops takes O(N^2). So, the total time complexity comes down to O(N^2)
    #O(N) - Space complexity to store the sorted array we are using another array.
    def findPairs(self, nums: List[int], k: int) -> int:
        sorted_nums = sorted(nums)
        cnt = 0
        
        for i in range(len(sorted_nums)):
            if (i > 0 and sorted_nums[i] == sorted_nums[i - 1]):
                continue
            for j in range(i +1, len(sorted_nums)):
                if(j > i + 1 and sorted_nums[j] == sorted_nums[j - 1]):
                    continue
                if abs(sorted_nums[j] - sorted_nums[i] == k):
                    cnt += 1
        return cnt
        
        
        
        
        
        