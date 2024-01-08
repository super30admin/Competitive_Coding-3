'''

Time Complexity : O(n)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No issues faced

Your code here along with comments explaining your approach

Very similar to 2-sum, we check if a pair of elements exists whose sum is equal to the target and add it to a hashset
The hashset holds all the unique pair of numbers

'''

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        maps = set()
        res = set()

        for i in range(len(nums)):
            if (nums[i]-k) in maps:
                if (nums[i]-k,nums[i]) in res or (nums[i],nums[i]-k) in res:
                    continue
                res.add((nums[i]-k,nums[i]))

            if (nums[i]+k) in maps:
                if (nums[i]+k,nums[i]) in res or (nums[i],nums[i]+k) in res:
                    continue
                res.add((nums[i]+k,nums[i]))

            maps.add(nums[i])

        return len(res)