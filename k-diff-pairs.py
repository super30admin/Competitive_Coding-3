"""Approach:
For each key check if key+k=x is in the map
such that x-key=k e.g.
[3,1,4,1,5] k =2 ,if 3+2 is in the map, then add c+=1
also if you have k =0 then you have to handle the edge case
because key+0 will be always in the map and you will get wrong answer
hence you use frequency. If you have freq//2 >=1 then you can make at least 
1 pair of two numbers to get the k=0. E.g. [1,1,1,1,1] k=0

TC O(N) to loop twice, once on all N elements of nums and once over all dict keys, which can be also N or less.
SC O(N) for all nums to be put in the map
"""
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        m = dict()
        for n in nums:
            if n in m:
                m[n] += 1
            else:
                m[n] = 1
        c = 0  # counter
        # For each key check if key+k=x is in the map
        # such that x-key=k e.g.
        # [3,1,4,1,5] k =2 ,if 3+2 is in the map, then add c+=1
        # also if you have k =0 then you have to handle the edge case
        # because key+0 will be always in the map and you will get wrong answer
        # hence you use frequency. If you have freq//2 >=1 then you can make at least 
        # 1 pair of two numbers to get the k=0. E.g. [1,1,1,1,1] k=0
        for e in m.keys():
            if e+k in m:
                if k==0 and m[e+k] // 2 >= 1: 
                    c+=1
                elif k !=0 :
                    c += 1
        return c



