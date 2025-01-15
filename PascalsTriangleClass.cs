public class Solution
{
    public IList<IList<int>> Generate(int numRows)
    {
        IList<IList<int>> result = new List<IList<int>>();

        result.Add(new List<int>() { 1 });
        if (numRows == 1)
        {
            return result;
        }

        for (int i = 1; i < numRows; i++)
        {   //i =3
            var list = new List<int>() { 1 };
            for (int j = 1; j < i; j++)
            {         // j=2
                list.Add(result[i - 1][j - 1] + result[i - 1][j]);
                //result[2][1]+result[1][2]
            }
            list.Add(1);
            result.Add(list);
        }
        return result;
    }
}