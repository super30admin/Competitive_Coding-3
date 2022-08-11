"""
TC = O(n*n)- where n is the number of rows
SC = O(1)
"""

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        list1 = [1]
        list2 = [1,1]
        finalList = []
        finalList.append(list1)
        if numRows ==1:
            return finalList
        finalList.append(list2)
        if numRows == 2:
            return finalList
        
        
        for i in range(2, numRows):
            tempList = []
            tempList.append(1)
            for j in range(1,i):
                
                tempList.append(finalList[i-1][j-1]+finalList[i-1][j])
            tempList.append(1)
            finalList.append(tempList)
        return finalList
                
                
            