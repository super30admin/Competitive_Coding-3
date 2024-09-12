"""
Time Complexity : O(n) need to iterate through all the elements of the array.
Space Complexity : O(n+size(hashset)) where n is the number of elements in an input array. Space use for hashmap is O(n) and O(size(result)) for hashset.
Did this code successfully run on Leetcode :
Any problem you faced while coding this :


Your code here along with comments explaining your approach:
Create a hashset to store the unique pair difference and store the numbers and there respective index in hashMap to check i != j condition.
Find a complement of numbers with k and check if the complement is present in hashMap if yes check if its index is not same as the number we are iterating on and then add it to hashSet if that pair is not already added.
"""
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if k < 0 :
            return 0
        
        #Declare the hashmap 
        hashMap = {}
        for i in range(len(nums)):
            hashMap[nums[i]] = i
        
        result = set()
       
        for i in range(len(nums)):
            complement1 = nums[i] - k
            complement2 = nums[i] + k
            
            if complement1 in hashMap.keys():
                temp = (nums[i], complement1)
                if (nums[i], complement1) not in result and (complement1, nums[i]) not in result and hashMap[complement1] != i:
                    result.add((nums[i], complement1))
            
            temp = set()
            if complement2 in hashMap.keys():
                temp = (nums[i], complement2)
                sorted(temp)
                if (nums[i], complement2) not in result and (complement2, nums[i]) not in result and hashMap[complement2] != i:
                    result.add((nums[i], complement2))

        return len(result)
        