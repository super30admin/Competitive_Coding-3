class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        '''Time Complexity: O(n^2)
        Space Complexity: O(1)
        '''
        if numRows == 1:
            return [[1]]
        
        if numRows == 2:
            return [[1],[1,1]]
        
        result=[[1],[1,1]]
        
        for i in range(2,numRows):
            temp=[None]*(i+1)
            temp[0]=1
            temp[-1]=1
            prev_row=result[i-1]
            for j in range(1, len(temp)-1):     
                temp[j]= prev_row[j-1]+prev_row[j]
            result.append(temp)
        
        return result
                
            
            
        
        
