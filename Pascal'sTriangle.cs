// time complexity O(n^2)
// space complexity O(n^2)
public class Solution
{
    public IList<IList<int>> Generate(int numRows)
    {
        IList<IList<int>> res = new List<IList<int>>();

        for (int i = 0; i < numRows; i++)
        {
            List<int> row = new List<int>();

            for (int j = 0; j <= i; j++)
            {
                if (j == 0 || j == i)
                {
                    row.Add(1);
                }
                else
                {
                    int left = res[i - 1][j - 1];
                    int right = res[i - 1][j];
                    row.Add(left + right);
                }
            }
            res.Add(row);
        }
        return res;
    }
}