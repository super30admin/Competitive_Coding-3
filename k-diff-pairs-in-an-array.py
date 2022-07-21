#Bruteforce approach
"""
Runtime Complexity:
O(n^2) - because we perform a exhaustive approach by going over all the elements. Therefore we have two nested 'for' loops which gives us overall
runtime complexity of O(n^2).
Space Complexity: O(n) - nums list is sorted and stored in a array called sorted_nums which whill hold 'n' elements. 
Time limit exceeded solution.
"""

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        sorted_nums = sorted(nums)
        result = 0
        
        for i in range(len(sorted_nums)):
            if (i>0 and sorted_nums[i] == sorted_nums[i-1]):
                continue
            for j in range(i+1,len(sorted_nums)):
                if (j>i+1 and sorted_nums[j] == sorted_nums[j-1]):
                    continue
                if abs(sorted_nums[j]-sorted_nums[i])==k:
                    result+=1
        return result

#Optimized solution
"""
Runtime Complexity:
O(n) - we run a for loop to traverse the count_map.
Space Complexity: O(n) - we create a hashmap which stores the number as keys and their frequencies as value.
Yes, the code worked on leetcode.
Issues while coding - No
"""
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        count_map = Counter(nums)
        result = 0
        
        for i in count_map:
            if k>0 and i+k in count_map:
                result+=1
            if k==0 and count_map[i]>1:
                result+=1
        return result
        
        