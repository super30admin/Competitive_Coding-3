def generate(self, numRows: int) -> List[List[int]]:
    """
    Time Complexity: O(N^2)

    Space Complexity: O(N)
    """
    pascalTriangle = [ [1]*i for i in range(1,numRows+1)]

    for i, n_rows in enumerate(pascalTriangle):
        if i == 0 or i==1:
            continue
        else:
            for j, row in enumerate(n_rows):
                if j==0 or j==len(n_rows)-1:
                    continue
                pascalTriangle[i][j] = pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j]
    
    return pascalTriangle
