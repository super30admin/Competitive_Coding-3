"""
Name: Srinidhi Bhat
Time Complexity: O(n) - Iterating once
Space Complexity: O(n)- Hashmap

Did it run on LC: yes 
Logic: first maintain a freq hasmap
iterate through the array and find if number+k is a kew in the hashmap
if yes, then there exists a pair, increment counter by 1. 
"""
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        my_map = {}
        for i in range(len(nums)):
            if nums[i] not in my_map:
                my_map[nums[i]] = 1
            
            else:
                my_map[nums[i]]+=1
        ans = 0
        for number,freq in my_map.items():
            if k > 0 and number + k in my_map.keys():
                ans+=1
            elif k ==0 and my_map[number] > 1:
                ans+=1
        return ans