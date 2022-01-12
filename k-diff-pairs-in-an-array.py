'''

TC: O(nlogn)
SC: O(1)

Intuition:

|x - y| = k
x - y = k or x - y = -k or (x +/- k = y)

sort the array, for every x , use the above condition and find y

'''
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        slen = len(nums)
        if slen <= 1:
            return 0
        
        snums = sorted(nums)
        
        def bs(target, start, end, snums):
            
            while start <= end:
                mid = start + (end - start) // 2
                if snums[mid] == target:
                    return mid
                if snums[mid] > target:
                    end = mid - 1
                else:
                    start = mid + 1
            
            return -1
        
        res = set()
        
        for idx in range(len(snums)):
            p1 = bs(snums[idx] - k, idx + 1, slen - 1, snums)
            p2 = bs(snums[idx] + k, idx + 1, slen - 1, snums)
            
            if p1 != -1:
                res.add((snums[idx], snums[p1]))
            if p2 != -1:
                res.add((snums[idx], snums[p2]))
        
#         print(snums, res)
        
        return len(list(res))