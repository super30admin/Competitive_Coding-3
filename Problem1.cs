// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/*
I create a list of integer lists and add [1] to it. If numRows == 1, I return the result straightaway. Else I iterate i = 2 to numRows number of times, I create a temp list for each iteration and add
[1,1] as the first and last element of the list. All the other elements of the list are made up by the sum of each pair of numbers present in the previous list.
*/

public class Solution {
    public IList<IList<int>> Generate(int numRows) {
        List<IList<int>> result = new();
        result.Add(new List<int>{1});

        if(numRows == 1)
        {
            return result;
        }

        for(int i = 2; i <= numRows; i++)
        {
            List<int> temp = new();
            temp.Add(1);
            IList<int> previousList = result[result.Count - 1];

            for(int j = 1; j < previousList.Count; j++)
            {
                temp.Add(previousList[j] + previousList[j-1]);
            }

            temp.Add(1);
            result.Add(temp);

        }

        return result;

    }
}