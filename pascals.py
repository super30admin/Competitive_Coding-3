# Time Complexity : O(n^2)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No

# create a list of list -number of rowa equal to numrows inputed and number of lements in each row will be from 0 to the row id except for first row
# create a temp array and add it to the resulting list of list

class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        res=[]
        res.append([1])
        for i in range(1,numRows):
            temp=[]
            temp.append(1)
            for j in range(1,i):
                print("inside")
                temp.append(res[i-1][j-1]+res[i-1][j])
            temp.append(1)
            res.append(temp)       
        return res
        