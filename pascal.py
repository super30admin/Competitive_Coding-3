"""
Intuition: The repeated subproblem is that the sum of an element is the sum of the element at the previous row, col
and previous row, previous column

#####################################################################
Time Complexity : O(row * col) 
Space Complexity : O(1) 
#####################################################################
"""
def getPascalsTraingle(rows):

    if rows == 0:
        return []

    if rows == 1:
        return [[1]]
    if rows == 2:
        return [[1], [1,1]]
    
    triangle =  [[1], [1,1]]

    for row in range(2, rows):
        subRow = [1] * (row + 1)
        for col in range(row + 1):

            #First and last columns have 1
            if col == 0 or col == row:
                subRow[col] = 1

            #Subproblem
            else:
                subRow[col] = triangle[row-1][col-1] + triangle[row-1][col]     
        triangle.append(subRow)
    print(triangle)
    return triangle


print(getPascalsTraingle(2))