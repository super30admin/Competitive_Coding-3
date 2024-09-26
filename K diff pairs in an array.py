'''
Time Complexity: O(nlogn), where n is the length of the list nums
Space Complexity: O(1)
Executed Successfully: Yes
Challenges Faced: No
'''

#CODE
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        nums.sort()
        count = 0
        slow = 0
        fast = 0
        n = len(nums)
        
        while fast < n and slow < n:
            if slow == fast or nums[fast] - nums[slow] < k:
                fast += 1
            elif nums[fast] - nums[slow] > k:
                slow += 1
            else:
                count += 1
                slow += 1
                fast += 1
                while fast < n and nums[fast] == nums[fast-1]:
                    fast += 1
        return count
            
            
        