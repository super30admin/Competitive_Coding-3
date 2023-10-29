// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows)
    {
        var row = new ArrayList<>(List.of(1));
        List<List<Integer>> res = new ArrayList<>(List.of(row));
        if (numRows == 1) return res;

        row = new ArrayList<>(List.of(1, 1));
        res.add(row);

        for (var i=2; i < numRows; i++)
        {
            var newRow = new ArrayList<>(List.of(1));

            for (var j=0; j+1 < row.size(); j++)
                newRow.add(row.get(j) + row.get(j+1));

            newRow.add(1);
            res.add(newRow);
            row = newRow;
        }
        return res;
    }

}
