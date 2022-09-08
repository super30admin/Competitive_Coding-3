// Time Complexity : O(numRows ^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no

//https://leetcode.com/problems/pascals-triangle/
// Your code here along with comments explaining your approach

public class PascalsTriangle{
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        result.add(new ArrayList<>());
        result.get(0).add(1);

        for(int rowNum = 1 ; rowNum < numRows ; rowNum++ ){
            List<Integer> currRow = new ArrayList<>();
            List<Integer> prevRow = result.get(rowNum-1);

            currRow.add(1);

            for(int j = 1 ; j < rowNum ; j++){
                currRow.add(prevRow.get(j-1) + prevRow.get(j));
            }

            currRow.add(1);

            result.add(currRow);
        }
        return result;
    }
}
