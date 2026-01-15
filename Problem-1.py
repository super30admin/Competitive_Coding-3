#Pascal's Triangle
# Time Complexity :O(n2)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no


# Your code here along with comments explaining your approach
#start with first row of pascal triangle as [1] and then iterate through numsRows and keep adding arrays to result array by adding sum of the two numbers directly above and also parallely checking the two edges of each row
#time - O(n2)
#space - O(1)

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = [[]]
        if(numRows==0):
            return result
        result = [[1]]
        i=2
        while(i<=numRows):
            p1=0
            p2=1
            curr=[]
            j=0
            while(j<i):
                if(j==0 or j==i-1):  #check if it is edges of each row
                    curr.append(1)
                    j=j+1
                    continue
                curr.append(result[i-2][p1]+result[i-2][p2]) #sum of the two numbers directly above 
                j=j+1
                p1=p1+1
                p2=p2+1
            result.append(curr)
            i=i+1
        return result
        
        