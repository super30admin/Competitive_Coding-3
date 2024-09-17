# I used 2 loops to manipulate the element at index of 2D matrix to print element in pascal triangle
# Time Complexity: O(n^2)
#Space Complexity: O(m*n)
def pascal(n):
    result = [[0 for x in range(n)]  for y in range(n)]  
    print(result)
    for i in range(n):
        for j in range(i+1):
            if j == 0 or j == i:
                result[i][j] = 1
                print(result[i][j],end =" ")
            else:
                result[i][j] = (result[i - 1][j - 1] + result[i - 1][j]) 
                print(result[i][j],end=" ")

pascal(6)


