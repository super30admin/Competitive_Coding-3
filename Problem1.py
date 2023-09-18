# tc: O(n)
# sc: O(n)

class Solution:
    def findPairs(self, nums, k):
        counter, pairs =  {}, 0
        
        for i in range(len(nums)):
            counter[nums[i]] = counter.get(nums[i], 0) + 1
        
        for item in counter:
            if k > 0 and item + k in counter:
                pairs += 1
            elif k == 0 and counter[item] > 1:
                pairs += 1
        return pairs