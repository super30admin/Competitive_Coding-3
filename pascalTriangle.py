# // Time Complexity :O(n^2) for and while
# // Space Complexity :O(n^2) for arr*i // not O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :No


# // Your code here along with comments explaining your approach

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        a = 1
        res = [[1]]
        for i in range(2,numRows+1):                #[[1],[1,0,1],[1,0,0,1]]
            arr = [0] * i
            arr[0] = 1                              #first and last are 1 
            arr[-1] = 1 
            
            # 2 pointers on previous result 
            l,h = 0,1
            while h < len(arr)-1:                   # height crosses new array length
                arr[h] = res[-1][l] + res[-1][h]    # add adjacent using old res
                l+=1
                h+=1 
            res.append(arr)                         # no need for deep copy
        return res