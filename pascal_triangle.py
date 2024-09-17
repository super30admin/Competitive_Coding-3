'''
TC:O(n^2)
SC:O(N^2)
'''
class Solution:
    def generate(self, num_rows):
        triangle = []

        for row_num in range(num_rows):
            row = [None for _ in range(row_num+1)]
            row[0], row[-1] = 1, 1

            for j in range(1, len(row)-1):
                row[j] = triangle[row_num-1][j-1] + triangle[row_num-1][j]

            triangle.append(row)
        return triangle

print(Solution().generate(5))