'''
    Time Complexity:
        O(n*log(n)) (where n = length of the given array)

    Space Complexity:
        O(n) (because of merge sort)

    Did this code successfully run on LeetCode?:
        Yes

    Problems faced while coding this:
        None

    Approach:
        Two Pointer approach
        Start i and j pointers at 0th index.
        At any instance:
            -> If i and j are equal, move j ahead.
            -> Else if the diff of num at j and num at i is less than k,
                this means that we want a bigger number, so move j ahead.
            -> Else if the diff between these two is greater than,
                this means that we want a smaller number, so move i ahead.
            -> Else, the diff should be equal to k.
                Increment count and move both i and j ahead.
                You have to make sure that num at j != num at j - 1 to avoid duplicate pairs.
                If it is the case, move j ahead until this condition is satisfied.

'''
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        nums.sort()
        i = j = count = 0

        while i < len(nums) and j < len(nums):
            diff = nums[j] - nums[i]

            if i == j or diff < k:
                j += 1
            elif diff > k:
                i += 1
            else:
                count += 1
                i += 1
                j += 1
                while j < len(nums) and nums[j] == nums[j - 1]:
                    j += 1

        return count
