# APPROACH 1: BRUTE FORCE
# Time Complexity : O(n^2), n: len(nums)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : No (TIME LIMIT EXCEEDED)
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. For each element of nums, go through all other elements after it (to the right of it)
# 2. For every such pair, check if absolute difference is k or not
# 3. Then add the sorted pair to a set
# 4. Return the length of the set

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        if not nums or k < 0:
            return 0
        
        result = set()
        for first in range(len(nums)):
            for second in range(first + 1, len(nums)):
                if abs(nums[first] - nums[second]) == k:
                    if nums[first] < nums[second]:
                        pair = (nums[first], nums[second])
                    else:
                        pair = (nums[second], nums[first])
                        
                    if pair not in result:
                        result.add(pair)
                        
        return len(result)



# APPROACH 2: Intermediate Solution
# Time Complexity : O(n lg n), n: len(nums) -> because of sorting
# Space Complexity : O(n) - space taken up by sorting
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Sort the nums
# 2. slow pointer and fast pointer -> if their diffrence is < k : need to increase it upto k so fast++
#                                 -> if the difference is k : add pair to set and slow++ fast++
#                                 -> if difference is more than k : need to decrease it so slow++
# 3. if fast and slow are at same index, fast++
# 4. Return the length of the set

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        if not nums or k < 0:
            return 0
        
        nums.sort()
        slow_ptr, fast_ptr, result = 0, 1, set()
        while fast_ptr < len(nums):
            
            if slow_ptr == fast_ptr or abs(nums[slow_ptr] - nums[fast_ptr]) < k:
                fast_ptr += 1
                
            elif abs(nums[slow_ptr] - nums[fast_ptr]) == k:
                pair = (nums[slow_ptr], nums[fast_ptr])
                result.add(pair)
                slow_ptr += 1
                fast_ptr += 1
                
            elif abs(nums[slow_ptr] - nums[fast_ptr]) > k:
                slow_ptr += 1
                
        return len(result)
                


# APPROACH 3: OPTIMAL SOLUTION 1 (result as set)
# Time Complexity : O(n), n: len(nums)
# Space Complexity : O(n) - > hashmap size
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Add all elements of nums along with their position as value to hashmap
# 2. Go through nums, check if its complement x-k and k-x exist in hashmap or not and if it does add to result (if not already present)
# 3. return the length of result set.

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        if not nums or k < 0:
            return 0
        
        hashmap, result = {}, set()
        
        for ind in range(len(nums)):
            hashmap[nums[ind]] = ind
                
        for ind in range(len(nums)):
            
            if k == 0 and (nums[ind] in hashmap and ind != hashmap[nums[ind]]):
                result.add((nums[ind], nums[ind]))
                
            elif k > 0:
                
                if nums[ind] + k in hashmap and (nums[ind], nums[ind] + k) not in result:
                    result.add((nums[ind], nums[ind] + k))
                elif nums[ind] - k in hashmap and (nums[ind] - k, nums[ind]) not in result:
                    result.add((nums[ind] - k, nums[ind]))
                    
        return len(result)
                
                
                
                
# APPROACH 3: OPTIMAL SOLUTION 2 (result as count)
# Time Complexity : O(n), n: len(nums)
# Space Complexity : O(n) - > hashmap size
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Store the occurrence of unique elements in the hashmap
# 2. Go through the keys of the hashmap and check if its complement x-k and k-x exist in hashmap or not and if it does add to result (if not already present)
# 3. return the length of result set.
            
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        if not nums or k < 0:
            return 0
        
        hashmap, count = {}, 0
        
        for ind in range(len(nums)):
            if nums[ind] in hashmap:
                hashmap[nums[ind]] += 1
            else:
                hashmap[nums[ind]] = 1
        
        for key in hashmap:
            
            if k == 0 and hashmap[key] >= 2:
                count += 1
                
            elif k > 0 and key + k in hashmap:
                count += 1
                    
        return count
                
