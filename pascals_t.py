# // Time Complexity :O(n*k) where k in the number of rows and n is the elements in each row
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


# // Your code here along with comments explaining your approach



class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        li=[]

        for i in range(numRows):

            li.append([])
            for j in range(0,i+1):
                if j==0 or j==i:
                    li[i].append(1)
                else:
                    summ=li[i-1][j-1]+li[i-1][j]
                    li[i].append(summ)
        return li