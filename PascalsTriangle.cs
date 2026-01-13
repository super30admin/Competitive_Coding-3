//Time Complexity : O(n^2)
//Space Complexity : O(n^2)

//Approach
// Start with the first row [1] and add it to the result.
// For each new row, set the first and last elements to 1.
// Fill middle elements using prevRow[j−1] + prevRow[j], then add the row to the result.

public class Solution
{
    public IList<IList<int>> Generate(int numRows)
    {
        List<IList<int>> result = new List<IList<int>>();
        if (numRows == 0)
            return result;
        result.Add(new List<int>() { 1 });
        for (int i = 1; i < numRows; i++)
        {
            List<int> list = new List<int>();
            List<int> prevRow = (List<int>)result[i - 1];
            list.Add(1);
            for (int j = 1; j < prevRow.Count; j++)
            {
                list.Add(prevRow[j - 1] + prevRow[j]);
            }
            list.Add(1);
            result.Add(list);
        }
        return result;
    }
}
