# Pallavi Sapale
# works in leet

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:

        # Method 1 : Nested for loop( already [1] inserted)
        # Time Complexity : O ( rows ^ 2)
        # Space Complexity : O(n) , O(elements in the last row)
        '''
        - intuition from a matrix
        Problem :
        - do not make mistake while writing inner for loop
        - inner for loop not excuted when res = [[1]]
        - for loop starts when [[1],[1,1]]
        - outer for loop works for numRows - 1 times because we already have inserted 1
        '''

        '''
        if numRows == 0: return [] # base case returns [] and not [[]]

        l = []
        res = [[1]]

        for row in range(numRows-1): # 0 1 2 3 

            l.append(1)

            # does not go inside when row = 0
            for i in range(row): # does not go inside # 00 01 # 00 01 02
                print(i)
                l.append(res[row][i]+res[row][i+1])
            l.append(1)
            print('l',l)
            res.append(l)
            l = []

        print(res,'res')
        return res

        '''

        # Method 2 : Approach from video
        # Time Complexity : O ( rows ^ 2)/2, but overall is rows^2
        # Space Complexity : O(n) , O(elements in the last row)

        '''
        - whenever a triangular output, inner loop goes upto outer loop (i)
        - length of every row bounded by j

        '''

        if numRows == 0: return []

        res = []

        for i in range(numRows):  # i rows # number of rows bounded by i

            row = []  # a new row created everytime we go in

            for j in range(i + 1):  # j col, keeps track of cols, j<=i, length of every row bounded by j

                # if extremes, add 1
                if j == 0 or j == i:
                    row.append(1)
                else:  # all middle elements
                    # else will always start from j=1, hence j and j-1
                    # here j and j+1 does not apply because j=10 is always populated before
                    left = res[i - 1][j - 1]
                    right = res[i - 1][j]
                    row.append(left + right)

            res.append(row)

        print(res)
        return res
