// Time Complexity :O(n^2)
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach: We will use two lists.
//One list is to store the result. Another one is to keep the values of each row. We will use the first for loop to keep track of the rows,
//and the another one to calculate the values in the row. Element of the current row is equal to the sum of elements from the previous row previous column and previous row same column.

class Solution {
    public List<List<Integer>> generate(int numRows) {
List<List<Integer>> result= new ArrayList<>();

for(int i=0;i<numRows;i++)
{
    List<Integer> rows=new ArrayList<>();
    for(int j=0;j<=i;j++)
    {
        if(j==0 || j==i) rows.add(1);
        else
        {
            int left=result.get(i-1).get(j-1);
            int right=result.get(i-1).get(j);
            rows.add(left+right);
        }
    }
    result.add(rows);
}

return result;
    }
}