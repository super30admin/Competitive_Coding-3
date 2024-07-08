// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/* take the list of list integer, add 1 in to the list and then iterate through next row and calculate the other rows.*/
public class PascalTriangle {
 public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangleList = new ArrayList<>();
        List<Integer>  firstRow = new ArrayList<>();
        firstRow.add(1);
        triangleList.add(firstRow); //[[1]]

        for(int i=1; i<numRows; i++) {
            List<Integer> rowList = new ArrayList<>();
            rowList.add(1); // [1]
            for(int j=1; j< i; j++){
                rowList.add(triangleList.get(i-1).get(j-1) + triangleList.get(i-1).get(j));
            }
            rowList.add(1);
            triangleList.add(rowList);
        }

        return triangleList;

    }}