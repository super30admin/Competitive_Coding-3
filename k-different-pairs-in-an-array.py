
# Using hashmap
# Time Complexity: O(n)
# Space Complexity: O(n)
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        # Using hashmap
        d = {}
        count = 0
        # Create a hashmap with keys as the numbers and frequency as values
        for num in nums:
            if num in d:
                d[num] += 1
            else:
                d[num] = 1
        
        # Iterate through the dictionary
        for key,val in d.items():
            # Check if k>0 then is k+key in the dictionary, if yes, increment count
            if k > 0 and key+k in d:
                count += 1
            # Check if k is equal to 0 then is the value greater than 1 to form 0 in the dictionary, if yes, increment count
            elif k == 0 and d[key] > 1:
                count += 1
                
        return count
        