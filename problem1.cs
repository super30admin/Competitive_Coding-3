public class Solution {
    public IList<IList<int>> Generate(int numRows) {
        IList<IList<int>> output = new List<IList<int>>();
        for(var i=0;i<numRows;i++)
        {
            var innerList = new List<int>();
            for(var j=0;j<=i;j++)
            {
                if(j==0||j==i)
                {
                    innerList.Add(1);
                }
                else
                {
                    innerList.Add(output[i-1][j-1]+output[i-1][j]);
                }
            }
            output.Add(innerList);

        }
        return output;   
    }
}