# Time Complexity : O(n*n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#pascals triangle is basically combinations starting row from 0
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        a = {}
        a[0] = 1
        prod = 1
        for i in range(1,numRows):
            prod = prod * i
            a[i] = prod
        result = []
        for i in range(numRows):
            local = []
            for j in range(0,i+1):
                local.append(int(a[i]/(a[j]*a[i-j])))
            result.append(local)
        return result
    
    