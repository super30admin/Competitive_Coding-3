#https://leetcode.com/problems/pascals-triangle/
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        arr=[]
        n=numRows
        if n>=1:
            arr.append([1])
        if n>=2:
            arr.append([1,1])
        
        for i in range(3,n+1):
            cur=[1]
            prev=arr[i-2]

            for j in range(1,len(prev)):
                v=prev[j-1]+prev[j]
                cur.append(v)
            cur.append(1)
            arr.append(cur)
            
        return arr
        #Time O(n^2)
        #Space O(n), we can do O(n) space too by storing only 1 last row
        
