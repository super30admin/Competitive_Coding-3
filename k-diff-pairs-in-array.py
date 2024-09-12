# Time Complexity : O(n) - loop through array and dict
# Space Complexity : O(n) - dict space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        count = 0
        freq_hash = dict()
        for i in range(len(nums)):
            if nums[i] in freq_hash.keys():
                freq_hash[nums[i]] += 1
            else:
                freq_hash[nums[i]] = 1
        
        for key in freq_hash.keys():
            if k == 0:
                if freq_hash[key] > 1:
                    count+=1
            else:
                if (key+k) in freq_hash.keys():
                    count+=1
        return count
            