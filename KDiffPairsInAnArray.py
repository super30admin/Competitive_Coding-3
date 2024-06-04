# Time Complexity : O(n)
# Space Complexity: O(n)
class Solution:
    def findPairs(self, nums, k):
        if not nums or len(nums) <= 1 or k < 0:
            return 0
        count_map = {}
        count = 0
        for num in nums:
            count_map[num] = count_map.get(num, 0) + 1
        for key, value in count_map.items():
            if k == 0:
                if value >= 2:
                    count += 1
            else:
                if key + k in count_map:
                    count += 1
        return count

solution = Solution()

# Example 1:
nums = [3, 1, 4, 1, 5]
k = 2
print(solution.findPairs(nums, k))  # Expected output: 2

# Example 2:
nums = [1, 2, 3, 4, 5]
k = 1
print(solution.findPairs(nums, k))  # Expected output: 4

# Example 3:
nums = [1, 3, 1, 5, 4]
k = 0
print(solution.findPairs(nums, k))  # Expected output: 1