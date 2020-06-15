#532. K-diff Pairs in an Array
#Time Complexity : O(n). 
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
# intialised i and j to point at index 0 . then will check if current index and prev index value are same or difference betwenn i and j is less than target then we increment j value,  if difference greater than target increment i value else we increment count , i , j
#two pointer
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        i = 0
        j = 0
        count = 0
        nums = sorted(nums)
        n = len(nums) - 1
        while i <= n and j <= n:
            if i == j or nums[j] - nums[i] < k:
                j += 1
                
            elif nums[j] - nums[i] > k:
                i += 1
            elif nums[j] - nums[i] == k:
                #print(j)
                count += 1
                i += 1
                j += 1
                while (i <= n and j <= n) and (nums[j] == nums[j-1]):
                    j += 1
        return count
#bruteforce sol
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        res = []
        x = 0
        nums = sorted(nums)
        n = len(nums)
        count = 0
        for i in range(n):
            if (i > 0) and nums[i] == nums[i-1]:
                continue
            for j in range(i+1,n):
                x = nums[j] - nums[i]
                if x > k:
                    break
            
                if x == k:
                    print(count)
                    count = count + 1
                    break
                j = j + 1
            i = i + 1
        return count