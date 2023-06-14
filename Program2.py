#Time complexity is:O(n^2)
#Space complexity is: O(n)
#Program ran successfully on leetcode
#No issues faced while coding this program

class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        #Intializing the output list to be returned
        out_result=[[1]]
        #If the required number of rows are only 1, we will return out_result directly
        if(numRows==1):
            return out_result
        else:
            for i in range(1,numRows):
                #initial value in a array
                arr=[1]
                #We will be adding values from the previous array
                for j in range(0,i-1):
                    sum=out_result[i-1][j]+out_result[i-1][j+1]
                    #We will append the sum into arr list
                    arr.append(sum)
                #Final value of the arr
                arr.append(1)
                #Appending the final generated arr list into out_result
                out_result.append(arr)
        #retruning the out_reuslt list
        return out_result
            