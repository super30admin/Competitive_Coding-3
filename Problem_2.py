#pascals Traingle
# O(n^2)
# O(n)
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        #output array
        res = [[1]]
        for i in range(1, numRows):
            # temp array to be put into the res
            temp = [1]
            # added this as we need to calculate for rows more than 2 or equal to 2
            if i >=2:
                for j in range(0, i-1):
                    # same logic we discussed
                    temp.append(res[i - 1][j] + res[i - 1][j + 1])
            # this was not working because we were doing it out of the scope
            temp.append(1)
            res.append(temp)
        return res
#this worked in leetcode