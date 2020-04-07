"""
Pascal's triangle is a triangular 2-D array of integers which can be constructed from the following points:

The first row has th number 1.
For each subsequent row, each element is the sum of the numbers directly above it, on either side.
For example, here are the first few rows:

   1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

K is an input, then you have to return the kth row of Pascal's triangle. Do this using O(k) space.

"""
# Took n as K
class Solution:
    def Pascal1(self,n):
        output=[[1]*(i+1) for i in range(n)]  #  create a output lsit of list by all 1's
        print(output)
        for i in range(n):                   # number of rows
            for j in range(1, i):            # number of cols will be 1 less than row
                output[i][j] = output[i-1][j-1] + output[i-1][j]   # add elememts from top row
        return output[n-1]

    def Pascal2(self, n):
        output = []   #  create a empty list
        output.append([1])       # append [1] for first row
        output.append([1,1])     # append [1, 1] for 2nd row
        for i in range(2,n):     # number of rows
            inside=[]            # another inner output list
            inside.append(1)
            for j in range(1,i):
                inside.append(output[i-1][j-1] + output[i-1][j])
            inside.append(1)
            output.append(inside)
        return output[n-1]

pascal=Solution()

print(pascal.Pascal1(5))

print(pascal.Pascal2(5))
