// Time Complexity :O(n2)
// Space Complexity :O(n)//notcounting the output(allRows) list
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> allrows = new ArrayList<List<Integer>>();
    ArrayList<Integer> row = new ArrayList<Integer>();
    for(int i=0;i<numRows;i++)
    {
        //we need the first row to be populated, the result will be easier to generate
        //if we look at the output, we can understand that the current element is dependent
        //on the values of the previous column
        row.add(0, 1);
        for(int j=1;j<row.size()-1;j++)
            row.set(j, row.get(j)+row.get(j+1));
        allrows.add(new ArrayList<Integer>(row));
    }
    return allrows;
}