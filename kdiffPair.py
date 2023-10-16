class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        # Time Complexity: O(NLogN)
        # Space Complexity: O(N)
        res = set()
        nums.sort()
        store = set()
        for i in range(len(nums)-1,-1,-1):
            if (nums[i] + k) in store:
                res.add((nums[i], nums[i]+2))
            store.add(nums[i])
        return len(res)
