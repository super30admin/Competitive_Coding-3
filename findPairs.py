class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        hashmap = dict()
        count = 0
        # creating hte frequency dict
        for i in range(len(nums)):
            if nums[i] not in hashmap:
                hashmap[nums[i]] = 1
            else:
                temp = hashmap[nums[i]]
                hashmap[nums[i]] = temp + 1

        # iterate over the hashmap for )elemt - target being presnt in the hashmap
        for x, y in hashmap.items():
            if (x - k) in hashmap:
                if k != 0:
                    count += 1
                else:
                    if y >= 2:
                        count += 1

        return count
