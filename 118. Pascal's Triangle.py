# Time: O(n^2) where n is numRows => The outer loop runs until n and the inner loop runs i+1 so n*(n+1)
# space: O(n^2) because we have to store all rows tho we return res we still had to store arrays until we return which takes space while executing

# Generat rows and then append rows into the resultant array
# the no. rows would be from 0 to the numRows
# and the elements in row would be i + 1 with the ends being 1
# and rest of the elements being the addition of [i-1][j-1] and [i-1][j]

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = []

        for i in range(numRows):
            sub_arr = []
            for j in range(i+1):
                if j == 0 or j == i:
                    sub_arr.append(1)
                else:
                    left = res[i-1][j-1]
                    right = res[i-1][j]
                    sub_arr.append(left + right)
            res.append(sub_arr)
        
        return res