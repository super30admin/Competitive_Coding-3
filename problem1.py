// Time Complexity : O(n^2)     //n=number of rows i.e,row
// Space Complexity : O(n^2)    //n=number of rows i.e,row
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution:
    def generate(self, row: int) -> List[List[int]]:
        lst=[[1],[1,1]]
        if row==0:
            return []
        elif row==1:
            return [lst[0]]
        elif row==2:
            return lst[:2]
        for i in range(2,row):
            lst.append([1])
            for j in range(0,len(lst[-2])-1):
                lst[-1].append(lst[-2][j]+lst[-2][j+1])
            lst[-1].append(1)
            
        return lst
        
