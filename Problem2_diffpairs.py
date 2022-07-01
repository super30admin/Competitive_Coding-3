'''
Time complexity : O(n)
Space Complexity : O(n)
'''
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        count = 0
        c = Counter(nums)
        if k == 0:
            for key , val in c.items():
                if val > 1 :
                    count += 1
        else:
            for key , val in c.items():
                if key + k in c:
                    count += 1
        return count