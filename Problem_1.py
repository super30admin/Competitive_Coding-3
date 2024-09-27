# Time Complexity : O(n) space O(1)
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        
        d = {}
        for num in nums:
            d[num] = d.get(num, 0) + 1
            
        count = 0
        for key in d.keys():
            target = k + key 
            if k == 0 and d[key] >= 2:
                count += 1
            
            elif k != 0 and target in d:
                count += 1
            
            
        return count