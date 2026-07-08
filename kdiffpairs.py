class Solution:
    def findPairs(self, nums, k):
        if k < 0:
            return 0

        seen = set()
        pairs = set()

        for num in nums:
            if num + k in seen:
                pairs.add((num, num+k))

            if num - k in seen:
                pairs.add((num-k, num))

            seen.add(num)

        return len(pairs)

# TC - O(n)
# SC - O(n)