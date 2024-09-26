using System;
using System.Collections.Generic;

namespace Algorithms
{
    public class PascalsTriangle
    {
        /// Time Complexity : O(numberofRows2) 
        // Space Complexity :O(1)
        // Did this code successfully run on Leetcode :Yes
        // Any problem you faced while coding this :  Referred Online
        public IList<IList<int>> Generate(int numRows)
        {

            List<IList<int>> result = new List<IList<int>>();

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
                        int left = result[i - 1][j - 1];
                        int right = result[i - 1][j];
                        row.Add(left + right);
                    }
                }
                result.Add(row);
            }
            return result;
        }
    }
}
