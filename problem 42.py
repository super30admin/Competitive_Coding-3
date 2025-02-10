# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach
# Take a frequency map and in the map check for key-k value if it exists then count+=1
# if k==0 only then we check if the frequency of that number is > 1 or not and then increase the count accordingly


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        freq_m = {}
        for i in range(len(nums)):
            if nums[i] in freq_m:
                freq_m[nums[i]]  += 1
            else:
                freq_m[nums[i]] = 1
        
        count = 0
        for key in freq_m:
            diff = key - k

            if k == 0:
                if freq_m[key] > 1:
                    count += 1
            else: 
                if diff in freq_m:
                    count += 1
        
        return count
            

        