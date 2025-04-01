// Overall Time Complexity : O(n2) . The time taken to iterate over the outer array and the inner loop.
// Overall Space Complexity : O(n2) . The space complexity  is to store the entire triangle in a list of lists.
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No issues faced during implementation

import java.util.*;
class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(); 
        int n = numRows; // no of rows 
        for(int i = 0; i<n ; i++){ // iterate over each row 
            List<Integer> row = new ArrayList<>(); // create a row to insert the elements ie numbers
            for(int j = 0; j<=i; j++){ // itreate to create no of elements which is equal to size of row+1;
                if(j==0 || j==i){// we add 1 if we are on the leftmost index or right most index
                    row.add(1);
                }
                else{
                    int left = result.get(i-1).get(j-1); // for other elements we get the sum of left and right element from the previous row 
                    int right = result.get(i-1).get(j);
                    int currNum = left + right;
                    row.add(currNum);

                }
            }
            result.add(row);// return the list 
        }
        return result;
    }
}
