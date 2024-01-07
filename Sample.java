// Time Complexity : O(n^2)
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> generate(int numRows) {
        // 1 0 0
        // 1 1 
        // 1 [(j-1) + (j)] 2 1

        if(numRows < 1) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();


        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        for(int row = 1; row < numRows; row++){
            List<Integer> rowList = new ArrayList<>();
            for(int col = 0; col < row+1; col++){
                int jPrevItem = 0;
                int jItem = 0;

                if(col-1 >= 0){
                    jPrevItem = result.get(row-1).get(col-1);
                }

                if(col < row){
                    jItem = result.get(row-1).get(col);
                }

                int item = jPrevItem + jItem;
                rowList.add(item);

            }

            result.add(rowList);
        }

        return result;
    }
}
