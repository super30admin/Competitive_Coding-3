def pascalTriangle(numRows):

    if numRows == 0:
        return []
    
    parent = []

    for idx in range(numRows):
        temp = []

        for j in range(idx + 1):
            if j == 0 or j == idx:
                # fill with 1
                temp.append(1)

            else:
                # fill with sum of above numbers

                temp.append(parent[idx-1][j] + parent[idx-1][j-1])

        parent.append(temp)

    return parent