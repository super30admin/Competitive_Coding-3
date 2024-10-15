class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        vis = set()
        ans = set()

        n = len(nums)

        for num in nums:

            if (num + k) in vis:
                ans.add(num)

            if (num - k) in vis:
                ans.add(num - k)
            vis.add(num)

        return len(ans)


# time complexity is O(n) since we go through the nums array only once and add to the sets
# space complexity is O(n)  O(n), due to the auxiliary sets vis and ans.
