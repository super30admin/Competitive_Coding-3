'''
Time Complexity: O(n)
Space Complexity: O(n)
Run on Leetcode: YES
Problem faced: Handling edge case where k = 0
'''
class Solution:
    def findPairs(self, nums: list[int], k: int) -> int:
        mSet = set()
        uniqueVal = set()
        count = 0
        for num in nums:
            if (not num in mSet) and k > 0:
                if num - k in mSet:
                    count += 1
                if num + k in mSet:
                    count += 1
            elif k == 0 and num in mSet and (not num in uniqueVal):
                count += 1
                uniqueVal.add(num)
            mSet.add(num)
        return count