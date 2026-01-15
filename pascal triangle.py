class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        
        nums=[]


        for i in range (numRows):
            row = [1]* (i+1)
            
            for j in range (1,i):
                row[j] = nums[i-1][j-1] + nums[i-1][j]
            
            nums.append(row)
        return nums
            
        