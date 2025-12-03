#Time Complexity- O(n) Space Complexity- O(n)
class Solution:
    def findPairs(self, nums: list[int], k: int) -> int:
        s = set()
        map = { }
        for i in range(len(nums)):
            map[nums[i]] = i
        for i in range(len(nums)):
            y = nums[i] - k

            if y in map and map[y] != i:
                if y > nums[i]:
                    s.add((y, nums[i]))
                else:
                    s.add((nums[i],y))
            y = nums[i] + k

            if y in map and map[y] != i:
                if y > nums[i]:
                    s.add((y, nums[i]))
                else:
                    s.add((nums[i], y))

        return len(s)
