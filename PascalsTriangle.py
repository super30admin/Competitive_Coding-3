# Time Complexity O(n)^2
# Space Complexity O(n^2)
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        
        if numRows == 1:
            return [[1]]
        if numRows == 2:
            return[[1],[1,1]]
    
        pt = [[1],[1,1]]
  
    
        for i in range(2, numRows):
            ptr1 = 0 
            ptr2 = 1
            pt.append([1])
            while(ptr2<len(pt[i-1])):

                pt[i].append(pt[i-1][ptr1] + pt[i-1][ptr2] )
                ptr1 +=1
                ptr2 +=1
        
            pt[i].append(1)

        return pt