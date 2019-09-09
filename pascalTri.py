"""
The approach here is to first initialize the first two rows of the triangle matrix to expected output.
now iterate till the given input value of numRows. and for every iteration add a 1 in the beginning and
the end. and for the middle elements calculate the sum using the formula mentioned in the code. just adding
the j and j+1 values.
"""

def generate(self, numRows):
        if numRows == 1:
            return [[1]]
        if numRows == 0:
            return []
        triangle = [[1],[1,1]]
        for i in range(2,numRows):
            triangle.append([1])
            for j in range(len(triangle[i-1])-1):
                triangle[i] += [triangle[i-1][j] + triangle[i-1][j+1]]
            triangle[i] += [1]
        return triangle