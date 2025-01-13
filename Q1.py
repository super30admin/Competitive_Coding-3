########### Generate Pascals Triangle

# Time Complexity : O(n^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Going level by level keep computing based on the elements of the previous level.

def generate_pascals_triangle(numRows):
    if numRows < 1:
            return [[]]
        
    arr = [[1]]
    for i in range(1,numRows):
        row = []  
        for j in range(0,i+1): 
            if j == 0:
                row.append(1)
                continue
            elif j == i:
                row.append(1)
                continue
            else:
                curr_val = arr[i-1][j] + arr[i-1][j-1]
                row.append(curr_val)
        arr.append(row)
    return arr

