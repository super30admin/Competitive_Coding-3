/*
Problem: Pascal's Triangle
Given an integer numRows, return the first numRows of Pascal’s triangle.

Rules:
- The first and last element of every row is 1.
- Any inner element at (row i, col j) is the sum of the two elements above it:
  triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j]

Approach:
1) Create an outer list to store all rows.
2) For each row i from 0 to numRows-1:
   - Create a list of size (i + 1)
   - For each column j from 0 to i:
       - If j == 0 or j == i, add 1 (edges)
       - Else add result[i-1][j-1] + result[i-1][j] (from previous row)
3) Return the triangle.

Time Complexity: O(numRows^2)  (total elements in triangle = 1 + 2 + ... + numRows)
Space Complexity: O(numRows^2) for storing the result (excluding output is not possible here since we must return it)
*/

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(numRows == 0){
            return result;
        }
        for(int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>(i+1);
            for(int j = 0; j <=i ; j++){
                if(j == 0 || j == i){
                    row.add(1);
                }
                else{
                    List<Integer> temp = result.get(i-1);
                    row.add(temp.get(j-1) + temp.get(j));
                }
            }
            result.add(row);
        }
        return  result;
    }
    public static void main(String[] args) {
        PascalsTriangle t = new PascalsTriangle();
        List<List<Integer>> result = t.generate(5);
        for(List<Integer> row : result){
            System.out.println(row);
        }
    }
}
