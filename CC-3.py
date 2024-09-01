# 118. Pascal's Triangle https://leetcode.com/problems/pascals-triangle/	

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        lst = list()
        for i in range(numRows):
            row = [1] * (i+1)
            for j in range(1,i):
                row[j] = lst[i-1][j-1] + lst[i-1][j]
                #i = 1, j = 2, row(2) = lst[0][1]+ lst[0][2]
                #i = 2, j = 3, row(3) = lst[1][2]+ lst[1][3]
            lst.append(row)

        return lst
# TC = O(n^2), SC = O(n^2)
        
# 532. K-diff Pairs in an Array https://leetcode.com/problems/k-diff-pairs-in-an-array/

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        cnt=0
        c=Counter(nums)

        if k==0:
            for key,v in c.items():
                if v>1:
                    cnt+=1
        else:
            for key,v in c.items():
                if key+k in c:
                    cnt+=1
        return cnt  
# TC = O(n), SC = O(n)