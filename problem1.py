#Pascal's Triangle
# // Time Complexity : O(N^2)
# // Space Complexity : O(1) because we return the array that we create
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this :no


def generate(numRows) :
    triangle = [[1]*(i+1) for i in range(numRows)]                      #create a 2d array with all 1s that grow by 1 every row
    for i in range(2, numRows):
        for j in range(1, i):
            triangle[i][j] = triangle[i-1][j]  +triangle[i-1][j-1]          #for every column starting with 1st index to the second last, add the number from previous row and previous row -1 column
    return triangle


#testing
print(generate(5))