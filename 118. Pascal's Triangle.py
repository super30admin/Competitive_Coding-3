## time complexity : O(n^2)
## Space Complexity : O(n^2)

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:

        
        arr = [[1]]

        for i in range(numRows - 1):

            ## add temporary zeroes on the end and start of our last row
            temp = [0] + arr[-1] + [0]
            nextRow  = []

            for j in range(len(arr[-1]) + 1):

                # take the sum of element above and the next element above of it
                nextRow.append(temp[j] + temp[j+1])
            arr.append(nextRow)
        
        return arr

      



        
