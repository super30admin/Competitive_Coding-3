class Solution:
    def findPairs(self, nums, k: int):
        if nums is None or len(nums) == 0:
            return 0

        nums.sort()
        slow = fast = 0
        count = 0
        n = len(nums)
        while fast < n:
            if slow == fast or nums[fast] - nums[slow] < k:
                fast += 1
            elif nums[fast] - nums[slow] > k:
                slow += 1
            else:
                count += 1
                fast += 1
                slow += 1
                while fast < n and nums[fast] == nums[fast - 1]:
                    fast += 1
        return count




if __name__ == "__main__":
    obj = Solution()
    print(obj.findPairs([3, 3, 3, 3, 1, 1, 1, 6, 6, 6, 1, 4, 4, 4, 4, 3, 1, 5, 5, 5, 5, 5, 5, 6, 6], 2))

# TC = O(nlogn). we are sorting the list and then traversing the list to check for pairs
# Space complexity : O(1). Constant. No extra space used
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : Yes, time limit exceed as I was running while in if statement to keep moving the fast pointer and
# in else again I was running to two while loops to keep incrementing slow and fast pointer
