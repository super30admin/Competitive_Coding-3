###
# Approach - We use a hashmap to store each number and its index for O(1) lookups.
# For each element in nums, we check if nums[i] - k or nums[i] + k exists in the map and is not the same index.
# We store the pair in sorted order (min, max) in a set to avoid duplicates.
# In the end, the number of unique valid pairs is returned.
#
# Time complexity - O(n): One pass to build the map and one pass to check for complements.
# Space complexity - O(n): For storing the hashmap and the result set.
###
class Solution:
    def findPairs(self, nums, k):
        map = {}
        comp = 0
        result = set()
        for i in range(len(nums)):
            map[nums[i]] =  i
        for i in range(len(nums)):
            comp = nums[i] - k
            if comp in map and map[comp] != i:
                res = (min(nums[i], comp), max(nums[i], comp))
                result.add(res)
            comp = nums[i] + k
            if comp in map and map[comp] != i:
                res = (min(nums[i], comp), max(nums[i], comp))
                result.add(res)
        return len(result)
    def main(self):
        nums1 = [3,1,4,1,5]
        k1 = 2
        print(self.findPairs(nums1, k1))
        nums2 = [1,2,3,4,5]
        k2 = 1
        print(self.findPairs(nums2, k2))

sol = Solution()
sol.main()