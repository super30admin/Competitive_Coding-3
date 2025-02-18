// Time Complexity : O(n^2) where n is the number of rows
// Space Complexity : O(n^2) where n is the number of rows
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// I have used a list of lists to store the pascal triangle.
// I have iterated over the number of rows and for each row, I have created a new list.
// For each row, I have iterated over the columns and added the values to the list.
// If the column is the first or the last, I have added 1 to the list.
// Else, I have added the sum of the previous row's column and the previous row's column+1.
import java.util.ArrayList;
import java.util.List;

class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        if(numRows == 0){
            return res;
        }

        for(int i = 0; i < numRows; i++){
            List<Integer> subList = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    subList.add(1);
                }else{
                    int val1 = res.get(i-1).get(j-1);
                    int val2 = res.get(i-1).get(j);
                    subList.add(val1+val2);
                }
            }
            res.add(subList);
        }
        return res;
    }
}
