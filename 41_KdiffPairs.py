# failed few test cases in leetcode where all the items in array are same.
# time - O(NlogN)
# sorted array and found the difference between right and left pointers.
class Solution:
    def findPairs(self, nums, k: int) -> int:
        nums=sorted(nums)
        print(nums)
        count=0
        if k < 0: return 0
        left=0
        right=1

        while right<len(nums):
            diff=nums[right]-nums[left]
            if diff==k and left < right:
                count=count+1
                right=right+1
            elif diff > k:
                left=left+1
            else:
                right=right+1
        return count