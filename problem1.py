# Time Complexity : O(n^2)    
# Space Complexity : o(1)

# Did this code successfully run on Leetcode : 
# YEs

# Any problem you faced while coding this : 

# Your code here along with comments explaining your approach


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        n= numRows
        if n ==  0 :
            return [[]]
        if n == 1:
            return [[1]]
        if n==2:
            return [[1],[1,1]]
        result = [[1],[1,1]]
        for i in range(2,n):
            result.append([1])
            for j in range( 1, i):     ####I  had n-1 here , it should be i
                sum_tri = result[i-1][j-1] + result[i-1][j]
                result[i].append(sum_tri)
            result[i].append(1)
            print(result)
        return result