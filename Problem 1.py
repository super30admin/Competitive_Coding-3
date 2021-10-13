class Solution:
    def generate(self, numRows):
        output = [[1]]

        for i in range(1, numRows):
            temp = [1]
            for j in range(1, i + 1):

                if (i == j):
                    temp.append(1)

                else:
                    temp.append(output[i - 1][j - 1] + output[i - 1][j])

            output.append(temp)
        return output

