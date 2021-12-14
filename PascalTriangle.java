// Time Complexity : O(n^2)
// Space Complexity : O(n)
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0 ; i < numRows ; i ++)
        {
           List<Integer> row = new ArrayList<>();
           for(int j = 0 ; j <= i ; j++)
           {
              // first row and last column is always 1
              if(j == 0 || j == i)
                  row.add(1);
               else
               {
                   List<Integer> prevRow = result.get(i-1);
                   row.add(prevRow.get(j-1) + prevRow.get(j));
               }
           }
            result.add(row);
        } 
        return result;
    }
}
