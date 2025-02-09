# Time : O(2n)
# Space: O(n)
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        n = len(nums)
        result = set()
        fast = 1
        slow = 0
        nums.sort() #[1,1,3,4,5]
        counts = {}
        for num in nums:
            if num in counts:
                counts[num] += 1
            else:
                counts[num] = 1
        while fast < n: # 5 fast: 4
            if fast > slow:
                if abs(nums[slow] - nums[fast]) == k:
                    result.add((nums[slow], nums[fast])) #([1,3], [3,5])
                    slow += counts[nums[slow]]
                elif abs(nums[slow] - nums[fast]) > k:
                    slow += counts[nums[slow]]
                    fast -= 1  
            fast += 1
        
        return len(result)

#Brut force:
# Time: O(n^2)
#  Space: O(n)
# You can reduce complexity by sorting and then two loop only until difference > target else break inner loop
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        n = len(nums)
        result = set()
        for i in range(n):
            for j in range(i+1, n):
                if abs(nums[i] - nums[j]) == k:
                    if nums[i] < nums[j]:
                        result.add((nums[i], nums[j]))
                    else:
                        result.add((nums[j], nums[i]))
        return len(result)