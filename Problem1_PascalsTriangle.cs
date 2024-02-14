// Time Complexity : O(n*n)
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Faced multiple errors related to incorrect usage of list of list which was corrected later.

public class Solution {
    public IList<IList<int>> Generate(int numRows) {
        IList<IList<int>> result = new List<IList<int>>();
        for(int i = 0; i < numRows; i++) {
            if( i == 0) {
                result.Add(new List<int>{1});
            }
            else {
                IList<int> prevRow = new List<int>();
                prevRow = result[i-1];
                IList<int> newRow = new List<int>();
                newRow.Add(1); // 1st element -> '1'
                for(int j = 1; j < i; j++){
                    //Sum of jth and j-1 th elements from previous row
                    newRow.Add(prevRow[j] + prevRow[j-1]);
                }
                newRow.Add(1); // Last element -> '1'
                result.Add(newRow);
            }
        }
        return result;
    }
}