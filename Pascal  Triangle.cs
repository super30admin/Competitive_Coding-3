/*
  Time complexity:O(n^2)
  Space complexity:O(1)

  Code ran successfully on Leetcode: Yes

*/

public class Solution {
    public IList<IList<int>> Generate(int numRows) {
        IList<IList<int>> result = new List<IList<int>>();
        
        if(numRows==0)
            return result;
        
        for(int rows = 0; rows<numRows; rows++)
        {
            List<int> subResult = new List<int>(new int[rows+1]);
            result.Add(subResult);
            
           for(int j=0;j<=rows;j++)
           {
               if(j==0 || j==rows)
                   subResult[j]=1;
               else
               {
                   subResult[j] = result[rows-1][j-1] + result[rows-1][j];
               }
           }
        }
        
        return result;
    }
}
