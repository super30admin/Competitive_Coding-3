public class PascalsTriangle
	{
        // Time Complexity : O(n^2) where n is numRows
        // Space Complexity : O(n)
        // Did this code successfully run on Leetcode : Yes
        // Any problem you faced while coding this : No
        public IList<IList<int>> Generate(int numRows)
        {
            IList<IList<int>> result = new List<IList<int>>();
            IList<int> firstRow = new List<int>();
            firstRow.Add(1);
            result.Add(firstRow);

            for (int i = 1; i < numRows; i++)
            {
                IList<int> prevList = result.Last();
                IList<int> newRow = new List<int>();
                newRow.Add(1);

                for (int j = 0; j < prevList.Count - 1; j++) //{1,2,1}
                {
                    newRow.Add(prevList[j] + prevList[j + 1]);
                }
                newRow.Add(1);
                result.Add(newRow);
            }
            return result;
        }
    }
