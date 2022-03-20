## pascal triangle

## space Complexity -> O(n^2)
## Time Complexity -> O(n^2)



def triangle(nrows):
    matrix = [[1]*(i+1) for i in range(nrows)]

    for i in range(nrows):
      for j in range(len(matrix[i])-1):
        if i > 0 and j > 0:
          matrix[i][j] = matrix[i-1][j-1] + matrix[i-1][j]

    return matrix    

