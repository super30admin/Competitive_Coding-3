public class Solution {
    public IList<IList<int>> Generate(int numRows) {
        List<IList<int>> list = new List<IList<int>>();
        
        if(numRows==0)
        {
            return list;
        }
        
        list.Add(new List<int>());
        list[0].Add(1);
        
        for(int r=1;r<numRows;r++)
        {
            List<int> row = new List<int>();
            IList<int> prevrow = list[r-1];
            row.Add(1);
            
            for(int j=1;j<r;j++)
            {
                row.Add(prevrow[j-1] + prevrow[j]);
            }
            row.Add(1);
            list.Add(row);
        }
        return list;
        
    }
}
