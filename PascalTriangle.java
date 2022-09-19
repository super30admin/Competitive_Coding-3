import java.util.ArrayList;
import java.util.List;

/**
Problem 3: Pascal's Triangle
Given an integer numRows, return the first numRows of Pascal's triangle.
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Time Complexity :   O (n^2)
Space Complexity :  O (1)
Did this code successfully run on Leetcode :    Yes (118. Pascal's Triangle)
Any problem you faced while coding this :       No
 */

 class PascalTriangle{
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        // base case
        result.add(new ArrayList<Integer>());
        result.get(0).add(1);
        
        for( int i =1; i< numRows; i++){
            List<Integer> currentRow = new ArrayList<Integer>();
            List<Integer> prevRow = result.get(i-1);
            
            // add first element
            currentRow.add(1);
            
            // // add in bewteen elements
            for( int j =1; j < i; j++){
                currentRow.add(prevRow.get(j-1) + prevRow.get(j));
            }
            
            // add last element
            currentRow.add(1);
            
            // add to result list
            result.add(currentRow);
        }
        return result;
    }

    // Driver code
    public static void main(String[] args)
    {
        PascalTriangle obj = new PascalTriangle();
        int numRows = 5;
        System.out.print(obj.generate(numRows));
    }
}
