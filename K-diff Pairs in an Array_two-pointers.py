class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        #Time Complexity: O(n log n) // due to sorting
        #Space Complexity: O(1)
        #where, n is the length of nums
        #Note: The hashmap solution would O(n) TC & SC
        
        nums.sort()

        left = 0
        right = 1
    
        count = 0
        while right <= len(nums) - 1 and left <= len(nums) - 2:
            if nums[right] - nums[left] == k:
                count += 1
                left += 1
                right += 1
                while right <= len(nums) - 1 and nums[right] == nums[right - 1]:
                        right += 1
                while left <= len(nums) - 2 and nums[left] == nums[left - 1]:
                    if left + 1 < right:
                        left += 1
                    else:
                        left += 1
                        right += 1
            elif nums[right] - nums[left] > k:
                if left + 1 < right:
                    left += 1
                else:
                    left += 1
                    right += 1
            else:
                right += 1
    
        return count