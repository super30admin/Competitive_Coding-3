# // Time Complexity : O(n) where n is the number of elements in the array
# // Space Complexity : O(m) where m is the number of unique elements in the array 
# for which recursive calls were made
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : none

# // Your code here along with comments explaining your approach
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        count = 0
        hashmap = Counter(nums)
        for key,val in hashmap.items():
            if k  > 0:
                if key + k in hashmap:
                    # print(key+k,key)
                    count += 1
            else:
                # handle k = 0 case separately
                if val > 1:
                    count += 1
        return count
                