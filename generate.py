#TC: O(n^2)
#SC: O(N^2) 
#Ran successfully on leetcode:Yes
# Here to get the ith element in the jth row, I go to previous row and get the sum of i-1 and ith element.
#The result is stored in a new list and is passed to result.

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res=[]
        temp=[]
        # arr=[]
        for i in range(numRows):
            temp.insert(0,1)
            for j in range(1,len(temp)-1):
                temp[j]=temp[j]+temp[j+1]
            arr=list(temp)
            # arr.
            res.append(arr)
        return res 
                
                    
            
            
