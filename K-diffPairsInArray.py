# Time complexity is O(n) n is the nums length
# Space complexity is O(n) for storing the elements in hashmap

class Solution:
    def findPairs(self, nums: list[int], k: int) -> int:

        # nums.sort()
        # if len(nums) == 1:
        #     return 0
        # p1 = 0
        # p2 = 1
        # count = 0
        # while p1 < len(nums) and p2 < len(nums) and p1 != p2:
        #     if nums[p2] == nums[p2 - 1] and k != 0:
        #         p2 += 1
        #     elif nums[p2] - nums[p1] == k:
        #         p1 += 1
        #         p2 += 1
        #         count += 1
        #     elif (nums[p2] - nums[p1]) > k:
        #         p1 += 1
        #     elif nums[p2] - nums[p1] < k:
        #         p2 += 1
        # return count

        # In this solution I took one hashmap and store all the unique elements in it
        # For duplicate elements I am increasing the count by one when duplicate occurs.
        # In second loop I am checking If count of duplicate is greater than 1.
        # Increase the count by 1
        # Also I am checking if key + target present in hashmap or not if present I am incresing count by one.
        hashmap = {}
        count = 0
        for i in range(len(nums)):
            if nums[i] in hashmap:
                hashmap[nums[i]] += 1
            else:
                hashmap[nums[i]] = 1

        for key, val in hashmap.items():
            if k == 0 and val > 1:
                count += 1
            if k != 0:
                if key + k in hashmap:
                    count += 1
        return count
