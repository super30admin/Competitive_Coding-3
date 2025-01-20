# Time = O(N), Space = O(N)
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        hashset1 = set()
        hashset2 = set()
        count = 0
        for i in range(len(nums)):
            
            if (nums[i] -k) in hashset1 and (nums[i] -k, nums[i]) not in hashset2:
                hashset2.add((nums[i]-k, nums[i]))
                count += 1

            if k>0 and (nums[i] + k) in hashset1 and (nums[i], nums[i]+k) not in hashset2:
                hashset2.add((nums[i], nums[i]+k))
                count += 1
            hashset1.add(nums[i])
        return count
        