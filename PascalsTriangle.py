#Start with the first row of Pascal’s triangle as [1].
#For each new row, build it using the sum of adjacent elements from the previous row.
#Add 1 at the start and end of every new row, and repeat until the desired number of rows.
#Time Complexity:O(n^2)
#Space Complexity:O(1)

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = []
        result.append([1]) #first row
        #result.append([1,1]) #second row
        # if i ==2:

        for i in range(1, numRows):

            prev_row=result[i-1]
            curr_row=[1] #first element of current row

            for j in range(1, len(prev_row)):
                curr_row.append(prev_row[j-1]+prev_row[j])           
            
            curr_row.append(1) #last element of current row
            result.append(curr_row)
        
        return result