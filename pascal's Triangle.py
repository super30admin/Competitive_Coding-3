# // Time Complexity : O(n^2)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

def triangle(rows):

    tri = [[1]]

    # outer loop to iterate through the triangles rows
    for i in range(1, rows):

        row = [1]

        # inner loop to iterate through the columns of each row to add from previous row 
        for j in range(1, i):

            # logic to add elements to the current row from previous row
            row.append(tri[i-1][j-1] + tri[i-1][j])

        # add 1 at the end of the row
        row.append(1)

        # add the row to the triangle
        tri.append(row)

    return tri