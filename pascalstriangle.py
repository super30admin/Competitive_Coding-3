# Time Complexity : O(KlogK)
# Space Complexity : O(K)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:   
        
        result = []  
        for k in range(1,numRows+1):
                res = [0]*(k)
                res[0] = 1
                res[k-1] = 1
                for i in range(1,k-1):
                    res[i] = result[k-2][i-1] + result[k-2][i]
                result.append(res)                
        return result
                