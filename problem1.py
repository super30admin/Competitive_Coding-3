'''
532. K-diff Pairs in an Array

TIME COMPLEXITY: O(n)
SPACE COMPLEXITY: O(n)
APPROACH: using set
LEETCODE: Yes
CUSTOM INPUT: Yes
DIFFICULTIES: Yes, in figuring out the logic to pass all the test cases.
'''

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        sset = {nums[0]} # num
        res = {(10**8, 1)}
       
        for i in range(1, len(nums)):
            if nums[i] - k in sset:
                res.add((nums[i], nums[i] - k))
                
            if nums[i] + k in sset:
                res.add((nums[i] + k, nums[i]))
                
            sset.add(nums[i])
                    
        return len(res) - 1
