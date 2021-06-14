"""
Approach:
Similar to 2sum problem.
1) initiate counter
2) if k == 0, you need to have at least 1 pair of the elements to satisfy condition
3) else, you can check if the compliment of each element exists
"""
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        hmap = {}
        count = 0
        for num in nums:
            if num in hmap:
                hmap[num] += 1
            else:
                hmap[num] = 1

        for key in hmap.keys():
            if k > 0 and ke y +k in hmap:
                count += 1
            elif hmap[key] > 1 and k == 0:
                count += 1

        return count

"""
TC: O(n)
SC: O(n)
"""