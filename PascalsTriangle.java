// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<i+1;j++)
            {
                if(j==0 || j==i)
                    row.add(1);
                else
                    row.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
            }
            result.add(row);
        }
        return result;
    }
}