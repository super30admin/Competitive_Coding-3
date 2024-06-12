# Time Complexity:- O(n*n)
# Space Complexity:- O(n)
# Approach:- We start from a 1-d matrix of [1] in every itertation we form the next 1-d array by adding the 2 value of the previous array at a 
# time and appending it to the result. After the iteration we have to append a 1 at the beginning and a 1 at the end. 
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows<1:
            return []
        res=[[1]]
        cur=[1]
        for n in range(1,numRows):
            newcur=[1]
            for i in range(0,len(cur)-1):
                newcur.append(cur[i]+cur[i+1])
            newcur.append(1)
            res.append(newcur)
            cur=newcur
        return res