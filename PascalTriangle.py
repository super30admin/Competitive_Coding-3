#TC: O(n)
#SC: O(1)

class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        output = [[1]]

        for i in range(1,numRows):
            temp = [0] + output[-1] + [0] #[0,1,0] for first iteration, [0,1,1,0] for the second iteration etc.
            row = []

            for j in range(len(output[-1])+1):
                row.append(temp[j] + temp[j+1])

            output.append(row)

        return output
        

obj = Solution()
rows = 5
output = obj.generate(rows)
print(output)