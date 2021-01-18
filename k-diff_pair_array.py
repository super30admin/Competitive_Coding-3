# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No



class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        
        count = Counter(nums)
        c_count = 0
        for key, value in count.items():
            #base case
            if k == 0:
                if value > 1:
                    c_count += 1
            else:
                # add key with input k 
                val = key + k
              
                if val in count:
                    c_count += 1

        return c_count
