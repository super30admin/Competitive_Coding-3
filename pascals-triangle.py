# Time Complexity: O(n*n)
# Space Complexity: O(1)
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        # Define an array to create a 2d array
        array = []
        for i in range(0, numRows):
            # This will create an array for each row
            list = []
            for j in range(0, i+1):
                # If the column is at 0 or last, append 1 to the row
                if j == 0 or j == i:
                    list.append(1)
                else:
                    #calculate the left and right from the previous row in the array to get their sum 
                    left = array[i-1][j-1]
                    right = array[i-1][j]
                    list.append(left + right)
            #keep appending the row created to the array to create a 2d matrix
            array.append(list)
        return array