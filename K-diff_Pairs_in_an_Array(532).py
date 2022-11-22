# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode :Yes
# Any problem you faced while coding this : No

# Here we store all the elements in a hashmap
# then we check if k==0 -> it can only be formed by elements that occur more than once
# else we iterate over the hashmap and look for the element curr_num+k
# NOTE to self: we don't look for num-k since that would be covered when we encounter
# element (num-k) as the curr_num
# so lets say there is 1,3,5 so for 3 we only search for 5 since the pair (1,3) would be covered
# when we traverse over 1
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        values = dict()
        count:int=0
        for num in nums:
            if num in values:
                values[num]+=1
            else:
                values[num]=1

        if k==0:
            for num in values:
                if values[num]>1:
                    count+=1
            return count

        for num in values:
            if num+k in values:
                count+=1

        return count



        # Binary Search Approach
    # Time Complexity: O(nlogn + nlogn) -> O(nlogn)
#         count:int = 0
#         nums.sort()
#         n:int = len(nums)

#         for i in range(n):
#             if i>0 and nums[i] == nums[i-1]:
#                 continue

#             low:int = i+1
#             high:int = n-1

#             while low <= high:
#                 mid:int = low + ((high-low)//2)
#                 if nums[mid]-k==nums[i]:
#                     count+=1
#                     break
#                 elif nums[mid]-k>nums[i]:
#                     high = mid-1
#                 elif nums[mid]-k<nums[i]:
#                     low = mid+1
#         return count