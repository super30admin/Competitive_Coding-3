# Time: O(n)
# Space: O(n)
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        count = 0
        hashset = set()
        flag = set()
        for i in range(len(nums)):
            if nums[i] in hashset:
                if k == 0 and nums[i] not in flag:
                    count += 1
                    flag.add(nums[i])
                continue
            if ((k + nums[i]) in hashset):
                count += 1
                # hashset.add(nums[i])
            if ((nums[i] - k) in hashset):
                count += 1
            hashset.add(nums[i])
            # print(hashset)
            # print(count)

        return count