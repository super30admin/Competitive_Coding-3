#118. Pascal's Triangle
#Time Complexity : O(n). 
#Space Complexity : O(n)
#Did this code successfully run on Leetcode : Yes
# if row value is 0  juster return array with value 1 , if row is 1 then return 1,1 if row if greater than 1 then we will append first 1 at i+1 then will add the prev row jth and j +1 elemt and store at jth location in current row and finnaly append 1.
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ans=[]
        i=0
        while i<numRows:
            if i==0:
                ans.append([1])
                i=i+1
            elif i==1:
                ans.append([1,1])
                i=i+1
            else:
                ans.append([1])
                for j in range(len(ans[i-1])-1):
                    ans[i].append(ans[i-1][j]+ans[i-1][j+1])
                ans[i].append(1)
                i=i+1
                   
        return ans