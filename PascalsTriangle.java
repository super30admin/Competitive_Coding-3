/*
 * #118. Pascal's Triangle
 * 
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 5

Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]

 */


/*
 * Time Complexity: O (N^2) -> no of rows and no of columns which is equal to 'numRows'
 * 
 * Space Complexity: O (N) -> A list created to store 'n' number of elements for every row
 * 
 * Did this code successfully run on leetcode: Yes
 * 
 * Any problem you faced while coding this: No
 * 
 */


package com.s30.edu.competitivecoding3;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
        // Create a resultant List
        List<List<Integer>> result = new ArrayList<>();
        
        // If numOfRows is zero, no triangle can be formed
        // return empty ArrayList
        if(numRows == 0){
            return result;
        }
        
        // Traverse through the number of rows and columns 
        // columns for every row will be <= i (row index)
        for(int i = 0; i < numRows; i++){
            // For every row, the output will be added in a list
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                // If first or last column at every row, add 1 -> pascal triangle has 1 at both ends in each row
                if(j == 0 || j == i){
                    list.add(1);
                }
                // else, add the elements from previous row to get value for current column
                else{
                    list.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
            }
            // After every row is filled, add the list to final result
            result.add(list);
        }
        return result; // return the list of lists -> final pascal triangle
        
    }
	
}
