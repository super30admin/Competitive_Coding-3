# Time Complexity: O(n)
# Space Complexity: O(n)
# Ran on Leetcode: Yes

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        hashmap = {}
        res = 0
        # Creating frequency map
        for elem in nums:
            if elem in hashmap:
                hashmap[elem] +=1
            else:
                hashmap[elem] = 1
        
        # Going through each element in hashmap
        for elem in hashmap:
            if k == 0:
                if hashmap[elem] > 1:
                    res += 1
            else:
                if elem + k in hashmap:
                    res += 1
        return res