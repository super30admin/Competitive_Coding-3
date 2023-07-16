#Time: O(nlogn)
#space: O(n) for sorting
#did the code run? yes
# approach:
# sort the array and using two pointers find the pairs with k difference
# sorting allows to not counting the duplicate pairs

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        i, j, n, result, prev_j = 0, 1, len(nums), 0, float('inf')
        nums.sort() #O(nlogn)
        if n ==1 or nums[-1] - nums[0] < k:
            return 0
        while i < n-1 and j < n:
            if nums[j] - nums[i] < k:
                j+=1
            elif nums[j] - nums[i] == k:
                if prev_j == nums[j]:
                    j+=1; continue #to skip duplicates
                prev_j = nums[j]
                result+=1
                i+=1
                j+=1
            else:
                i+=1
            if i == j: j+=1

        return result