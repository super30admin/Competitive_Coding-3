# Time Comlexity: O(nlogn) n:numRows
# Space Complexity: O(n)
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        nums.sort()  # nlogn
        result = {}
        count = 0
        p1 = 0
        p2 = 1
        while p1 < len(nums) and p2 < len(nums): #n
            compliment = nums[p2] - nums[p1]
            if p1 != p2 and compliment == k:
                print(nums[p1], nums[p2])
                result[(nums[p1], nums[p2])] = 1
                p1 += 1
                p2 += 1
            elif compliment < k:
                p2 += 1
            else:
                p1 += 1
        print(result)

        return len(result)
