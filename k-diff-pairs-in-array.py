class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        hashmap = {}

        for i in nums:
            if i not in hashmap:
                hashmap[i] = 1
            else:
                hashmap[i] +=1 
        
        count = 0

        for key, val in hashmap.items():
            diff = key - k
            # 
            if k == 0:
                if diff in hashmap and val > 1:
                    hashmap[key] = 0
                    count += 1
            else:
                if diff in hashmap:
                    count += 1

        return count