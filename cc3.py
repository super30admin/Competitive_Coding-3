# problem 1 : 532. K-diff Pairs in an Array : https://leetcode.com/problems/k-diff-pairs-in-an-array/
# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None

class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        res = Counter(nums)
        count = 0
        for key in res.keys():
            if k > 0 and k+key in res:
                count += 1
            elif k == 0 and res[key] > 1:
                count +=1
        return count
    

# problem 2 : 119. Pascal's Triangle I : https://leetcode.com/problems/pascals-triangle/
# Time Complexity : O(n^2)
# Space Complexity : O(n^2)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return []
        res = [[] for i in range(numRows)]
        for i in range(numRows):
            if i == 0:
                res[i].append(1)
            elif i == 1:
                res[i].append(1)
                res[i].append(1)
            else:
                res[i].append(1)
                for j in range(i-1):
                    res[i].append(res[i-1][j] + res[i-1][j+1])
                res[i].append(1)
        return res
                    
