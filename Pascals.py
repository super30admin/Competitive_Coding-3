"""#Pascals Traingle 
Time Complexity - O(n2)
Space Complexity - O(n2)"""
class Solution:
    def generate(self, numrows: int) -> List[List[int]]:
        #numrows <0
        if numrows==0:
            return[]
        elif numrows ==1:
            return [[1]]
        # if numrows >1

        else:
            output = [[1]] 
            for i in range(1,numrows): #each row
                rows = [1]
            #print(i)
                for j in range(1,i):
                    rowsval = output[i-1][j-1]+output[i-1][j]
                    rows.append(rowsval)
                
                rows.append(1)

                output.append(rows)
    
            return output