#  ------ Solution 1 --- 
'''   1. Sort array
      2. Maintain left and right pointer
      3. Append the result in set for unique

 Time complexity : O(nlogn)
 Space Complexity : O(n)
'''
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        n =len(nums)
        nums.sort()
        l ,r = 0, 1
        res = set()
        while l < n and r < n:
            diff = nums[r] - nums[l] 
            if diff == k:
                res.add((nums[l],nums[r]))
                l += 1
                r += 1
            elif diff < k:
                r += 1
            else:
                l += 1
            
            if l == r:
                r += 1
        print(res)
        return len(res)

#-------Soultion 2 : Creating hasmap with frequency
''' Time complexity : O(n)
    Space Complexity : O(n)
 '''
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        n =len(nums)
        count = 0
        hashmap = {}
        for n in nums:
            hashmap[n] = 1 + hashmap.get(n,0)
        for n in hashmap:
            if k == 0:
                if hashmap[n] >= 2:
                    count += 1
            else:
                comp = n + k 
                if comp in hashmap:
                    count += 1
        return count
            
            

