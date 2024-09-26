# https://leetcode.com/problems/pascals-triangle/

# Time Complexity : O(n)
# Space Complexity : O(n) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        n=numRows
        if n<=0:
            return []
        if n==1:
            return [[1]]
        if n==2:
            return [[1],[1,1]]
        arr=[[1],[1,1]]
        k=1
        for i in range(2,n):
            arr.append([])
            arr[i].append(1)
            for j in range(1,k+1):
                arr[i].append(arr[i-1][j-1]+arr[i-1][j])
            k+=1
            arr[i].append(1)
        return arr