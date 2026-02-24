# Pairs with K difference

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        visited_hash = {}
        count = 0
        for num in nums:
            if num not in visited_hash:
                visited_hash[num] = 1
            else:
                visited_hash[num]+=1
        if k == 0:
            vals_arr = visited_hash.values()
            for val_ar in vals_arr:
                if val_ar > 1:
                    count+=1
            return count
        for key,val in visited_hash.items():
            diff = key-k
            if diff in visited_hash:
                count+=1
        return count