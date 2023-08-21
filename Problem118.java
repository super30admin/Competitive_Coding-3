// Time Complexity : O(n)  numsRows
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<numRows;i++)
        {
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0|| j== i) row.add(1);
                else     // Above row left element +  Above row right element
                row.add(result.get(i-1).get(j-1)+result.get(i-1).get(j)); // here we fetch the last row (result.get(i-1))
               
            }
            result.add(row);
        }
        return result;
    }
}