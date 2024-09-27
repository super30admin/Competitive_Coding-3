#TC = O(nlogn)
#SC = O(n)



class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        lt = 0
        rt = 0
        res = []

        nums.sort()

        while (lt < len(nums) and rt < len(nums)):
            if (nums[rt] - nums[lt] < k or rt == lt):
                rt += 1
            elif (nums[rt] - nums[lt] > k):
                lt += 1
            else:
                lt += 1
                res.append([nums[rt], nums[lt]])

                while (lt < len(nums) and nums[lt] == nums[lt - 1]):
                    lt += 1

        return len(res)