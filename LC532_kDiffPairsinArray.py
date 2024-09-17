"""
TC = O(n) where n is the number of elements
SC = O(n)
"""

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        dictt = {}
        for n in nums:
            if n in dictt:
                dictt[n]+=1
            else:
                dictt[n]=1
        count = 0
        if k ==0:
            for el in dictt:
                if dictt[el]>1:
                    count+=1
        else:
            for el in dictt:
                if el+k in dictt:
                    count+=1
        return count
    