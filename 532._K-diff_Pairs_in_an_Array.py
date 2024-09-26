# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        count_map = collections.Counter(nums)
        count =0
        for key in count_map.keys():
            if k == 0 and count_map[key+k] >= 2: # if k is 0, then there must be 2 same elements in the list to be counted as pair
                count+=1
            elif k > 0 and key+k in count_map: # k cannot be negative
                count+=1
        return count