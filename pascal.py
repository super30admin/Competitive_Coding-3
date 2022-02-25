# Time Complexity : O(n**2)
# Space Complexity :O(n**2)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : a bit owing to coding


# Your code here along with comments explaining your approach


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
    
        def eachrow(main,row):
            out = []
            for i in range(row):   
                # The first and last row elements are always 1
                if(i==0 or i == row-1):
                    out.append(1)
                # Each triangle element is equal to the sum of the elements above-and-to-the-left and to the right
                else:
                    sum_1 = main[row-2][i] + main[row-2][i-1]
                    out.append(sum_1)

            

            return out
        
        
        
        main = []
        # calling the function to return the each row 
        
        for i in range(1,numRows+1):
                main.append(eachrow(main,i))
        return main 
        