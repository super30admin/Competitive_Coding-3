#All TC passed on leetcode

 #Here we create a pascals triangle using previous row enteries. 
 #The 1st and last element of the row has 1 as enteries and remianing elements are 
 #sum of previous row's previous column and cur column elements. 
 #Time complexity - O(n*(n+1)/2) = O(n^2) i.e. sum of naturanl numbers
 #Space complexity - O(1)
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:

        if numRows==1:
            return [[1]]

        res = [[1]]

        for i in range(1, numRows):
            res.append([1])
            for j in range(1, i):
                res[-1].append(res[i-1][j-1]+res[i-1][j])
            res[-1].append(1)
        return res