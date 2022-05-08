// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

public IList<IList<int>> Generate(int numRows) {

    //if numrows is 0, 1 or 2, return static list
    List<IList<int>> result = new List<IList<int>>();
    if(numRows == 0)
        return result;
    
    result.Add(new List<int>(){1});
    if(numsRows == 1)
        return result;

    result.Add(new List<int>(){1, 1});
    if(numsRows == 2)
        return result;

    for(int i = 2; i < numRows; i++)
    {
        List<int> current = new List<int>();
        //add 1 at current and last position in each row
        current.Add(1);
        for(int j = 1; j < i; j++)
        {
            //current element is sum of above row, one column behind and one column up
            current.Add(result[i-1][j-1] + result[i-1][j]);
        }

        current.Add(1);
    }
    return result;
}
