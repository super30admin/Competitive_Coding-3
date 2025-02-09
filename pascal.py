"""
TC - O(n^2)
SC - O(n)
"""
r = 4


def pascalTriangle(row):
    if row is None: return []

    triangle = []

    prevRow = []

    for i in range(row):
        # create row arr
        row = [1] * (i + 1)

        for j in range(1, i):
            # calculate sum
            row[j] = prevRow[j - 1] + prevRow[j]

        triangle.append(row)
        prevRow = row

    return triangle


print(pascalTriangle(r))
