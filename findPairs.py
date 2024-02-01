# Time Complexity: O(NlogN)
# Space Complexity: O(1)

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
      # Time Complexity: O(N)
      # Space Complexity: O(N)
      #hsh = set()
      #used = set()
      #res = 0
      #for n in nums:
      #  counters = [n + k, n - k]
      #  for counter in counters:
      #    if counter in hsh and (n,counter) not in used:
      #      used.add((n,counter))
      #      used.add((counter,n))
      #      res += 1
      #  hsh.add(n)
      #return res

      nums.sort()
      i, j = 0, 1
      res = 0
      while i < len(nums) and j < len(nums):
        if i == j:
          j += 1
        elif nums[j] - nums[i] == k :
          res += 1
          i += 1
          j += 1
          while i < len(nums) and nums[i] == nums[i-1]:
            i += 1
        elif (nums[j] - nums[i]) > k:
          i += 1
        else:
          j += 1
      return res


        
