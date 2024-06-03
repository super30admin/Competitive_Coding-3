# TC - O(n),
# SC -O(n)

# Approach

# create a hashmap to store the elements along with their count
# iterate through the hashmap, and compute x + k =y, where x is an element in the array and k is given
# if found increase the count by one
# in case k=0, that means both the elements are the same , in that case check that the element occurs more than once and increment the count


class Solution:
    def findPairs(self, nums, k):
        result = 0
        hashMap = {}

        for i in range(len(nums)):
            if nums[i] not in hashMap:
                hashMap[nums[i]] = 1
            else:
                hashMap[nums[i]] = hashMap[nums[i]]+1

        for x in hashMap:

            if k > 0 and x + k in hashMap:
                result += 1
            elif k == 0 and hashMap[x] > 1:
                result += 1
        return result
