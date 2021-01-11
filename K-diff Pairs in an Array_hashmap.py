class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        #Time Complexity: O(n)
        #Space Complexity: O(n)
        #where, n is the length of nums
        
        hash_map = {}
        count = 0
        for num in nums:
            if k != 0 and num in hash_map:
                hash_map[num] = hash_map.get(num, 0) + 1
                continue
            
            if hash_map.get(num, 0) > 1:
                hash_map[num] = hash_map.get(num, 0) + 1
                continue
            
            complement1 = num + k
            complement2 = num - k
            if complement1 in hash_map:
                count += 1
            if complement2 != complement1 and complement2 in hash_map:
                count += 1
            
            hash_map[num] = hash_map.get(num, 0) + 1
                
        return count