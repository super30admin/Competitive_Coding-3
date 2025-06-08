# Time Complexity: O(n) n is the len of nums
# Space Complexity: O(n) n is the len of nums
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if not nums or k < 0:
            return 0
        
        count = 0
        freq = Counter(nums)

        for num in freq:
            if k == 0:
                if freq[num] > 1:
                    count += 1
            else:
                if num + k in freq:
                    count += 1

        return count