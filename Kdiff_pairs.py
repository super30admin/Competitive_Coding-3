# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
#I have used 3 approaches to solve this problem
#First is Bruteforce which uses two loops one for 0 <= i <= n-1 and i+1 <= j <= n-1 then store the pair in set sorted so that we dont repeat (3,1) and (1,3) are same pairs
# Second approach would be using HashMap to check if the num - k or num + k in HashMap or not. If not we store num in HashMap.
# If we find the difference we got one pair then store it in HashSet as sorted pair and return len of set
#Third approach would just using HashMap to store the num. Then we iterate over the HashMap and check if k == 0 and freq >= 2 then we have found 1 pair
#Else increment count if the num - k in HashMap

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if len(nums) == 0 or len(nums) == 1:
            return 0
        result = set()
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                if abs(nums[i] - nums[j]) == k:
                    result.add(tuple(sorted((nums[i],nums[j]))))
        return len(result)
#Time - O(N2)
#Space - O(N)

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if len(nums) < 2:
            return 0
        dict = {}
        result = set()
        for i in range(len(nums)):
            diff = nums[i] - k
            adddiff = nums[i] + k
            if diff in dict:
                result.add(tuple(sorted((nums[i], diff))))
            if adddiff in dict:
                result.add(tuple(sorted((nums[i], adddiff))))
            dict[nums[i]] = diff #since not using value of dict in code we can store as diff or boolean value basically anything
        return len(result)

#Time - O(N)
#Space - O(N)

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if len(nums) < 2:
            return 0
        nums.sort()
        left = 0
        right = len(nums)-1
        count = 0
        while left < right:
            if nums[left] - k == nums[right] or nums[left] + k == nums[right]:
                count += 1
#Time - O(N)
#Space- O(N)

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if len(nums) < 2:
            return 0
        dict = {}
        count = 0
        for i in range(len(nums)):
            if nums[i] not in dict:
                dict[nums[i]] = 1
            else:
                dict[nums[i]] += 1
        for num in dict:
            freq = dict[num]
            if k == 0:
                if freq >= 2:
                    count += 1
            elif num - k in dict:
                count += 1      
        return count    
#Time - O(N)
#Space - O(N)

