// Time Complexity : O(n*n)
// Space Complexity : O(n*n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * For each row, the element at first and last position is 1. All other elements
 * are the sum of element at previous row and previous column + element at previous row and
 * current column.
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    row.add(1);
                }
                else 
                {
                    int left = ans.get(i-1).get(j-1);
                    int right = ans.get(i-1).get(j);
                    row.add(left+right);
                }
            }
            ans.add(row);
        }
        return ans;
    }
    
}