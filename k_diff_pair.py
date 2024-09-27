# Time Complexity : O(nlogn) m : no.of rows
# Space Complexity: O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach: Two pointers 
#           Initially sort the array, assign 2 pointers (here, fast and slow) and count to keep track of diff pairs 
#            case 1 : diff < k : increament the fast pointer
#            case 2 : diff > k : decrement  the slow pointer
#            case 3 : diff == 2 : increament count pointer and decreament the fast and slow pointer
#        if the elements are same in the sorted array increament the fast pointer till we reach the differert element


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        count = 0
        fast = 0
        slow = 0
        
        nums = sorted(nums)
        while slow < len(nums) and fast < len(nums):
            diff = nums[fast] - nums[slow]

            if slow == fast or diff < k:
                fast += 1
            elif diff > k:
                slow += 1
            else:
                count += 1
                slow += 1
                fast += 1
                while fast < len(nums) and nums[fast] == nums[fast - 1]:
                    fast += 1

        return count
        
        
        