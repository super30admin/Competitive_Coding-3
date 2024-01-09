from collections import Counter

# time complexity: O(n)
# space complexity: O(1)

class Solution:
    def findPairs(self, nums, k):
        if k < 0:
            return 0

        counter = Counter(nums)
        count = 0

        for num, frequency in counter.items():
            if (k == 0 and frequency > 1) or (k > 0 and num + k in counter):
                count += 1

        return count
