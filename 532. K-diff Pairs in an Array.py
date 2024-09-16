# Time Complexity O(n)
# Space Complexity O(n)
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        hash_map = {}

        for each in nums:
            if each in hash_map:
                hash_map[each] += 1
            else:
                hash_map[each] = 1

        count = 0

        for each in hash_map.keys():
            if k == 0:
                if hash_map[each] > 1:
                    count += 1
            else:
                if each + k in hash_map:
                    count += 1

        return count