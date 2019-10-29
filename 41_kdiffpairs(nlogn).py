# passed on leetcode
# time - O(NlogN), due to sorting
# sorted array and found the difference between right and left pointers and also check for unique elements.
class Solution:
    def findPairs(self, nums, k: int) -> int:
        nums=sorted(nums) # sorting elements
        count = 0 # get no. of pairs
        slow = 0
        fast = 0

        while slow < len(nums) and fast < len(nums): # check if both pointers are inside array length
            diff = nums[fast]-nums[slow] # find difference between 2 numbers at slow and fast pointers
            # case 1, when difference is less than k or slow and fast pointers are at same place increment fast
            if slow == fast or diff < k: fast += 1
            # case 2, differnce is greater than k increment slow.
            elif diff > k:
                slow=slow+1
            # case 3, difference is found which is equal to k. Increment both pointers and also add count.
            else:
                count += 1
                slow += 1
                fast += 1
                # check for uniqueness, when the fast pointer is pointing to index which is less than len(nums) and
                # fast and fast-1 elements are same
                while (fast < len(nums) and nums[fast] == nums[fast-1]): fast += 1
        return count