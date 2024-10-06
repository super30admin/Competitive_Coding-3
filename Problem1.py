# 532. K-diff Pairs in an Array
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        Map = {}
        count = 0
      
        for n in nums:
            if n not in Map:
                Map[n] = 1
            else:
                Map[n] += 1
        print(Map)

        if k == 0:
            for n in nums:
                if n in Map:
                    if Map[n] > 1:
                        count += 1
                    Map[n] = 0
            return count


        for n in nums:
            value = n-k
            if value in Map:
                count += 1
                Map.pop(value)
            else:
                count += 0

        return count

        

        