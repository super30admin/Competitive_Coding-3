class Solution:
    
    def __init__(self):
        self.pascalTriangle = []
    
    def getSolution(self,numRows):
        # Create a pascal triangle
        
        for i in range(0,numRows):
            # Initialize a list
            rowList = [None]*(i+1)
            
            for j in range(0,i+1):
                # Append the elements in pascalTriangle
                
                if j == 0 or j == i:
                    # 1 at 0-th and i-th count
                    rowList[j] = 1
                
                else:
                    rowList[j] = self.pascalTriangle[i-1][j] + self.pascalTriangle[i-1][j-1]
            
            # Once done append the rowList into the pascalTriangle
            self.pascalTriangle.append(rowList)
        
        # print the pascal triangle
        print('Pascal Triangle is:\t',self.pascalTriangle)
        
sol = Solution()
sol.getSolution(5)