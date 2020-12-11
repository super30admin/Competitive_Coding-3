/**
 * Time Complexity: O(numRows^2)
 * Space Complexity: O(1)
 * LeetCode: Y
 * Approach: 
    The firstRow is 1, and the secondRow is {1,1}.
    Numbers in ith row = i
    The first and last number of each row is 1.
    pascalTriangle[i][j] = pascalTriangle[i-1][j - 1] + pascalTriangle[i -1][j]
 */

class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Initialize output pascalTriangle
        List<List<Integer>> pascalTriangle = new ArrayList<List<Integer>>();
        
        // if numRows is invalid then the return the empty resultant pascalTriangle
        if(numRows <= 0) {
            return pascalTriangle;
        }
        
        // FirstRow of pascalTriangle is [1], initialize firstRow
        List<Integer> firstRow = new ArrayList<Integer>();
        
        // Add 1 to the firstRow
        firstRow.add(1);
        
        // Add firstRow to the pascalTriangle
        pascalTriangle.add(firstRow);
        
        // to form the remainingRows from 2nd row to numRows
        for(int i = 1 ; i < numRows ; i++) {
            // get the previousRow from pascalTriangle
            List<Integer> previousRow = pascalTriangle.get(i - 1);
            
            // initialize the nextRow
            List<Integer> nextRow = new ArrayList<Integer>();
            
            // Add the first element: 1 to the new row
            nextRow.add(1);
            
            // Form the middle element of the new row
            for(int j = 1 ; j < i ; j++) {
                // pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i -1][j]
                nextRow.add(previousRow.get(j - 1) + previousRow.get(j));
            }
            
            // Add the last element: 1 to the new row
            nextRow.add(1);
            
            // Add the new row to resultant pascalTriangle
            pascalTriangle.add(nextRow);
        }
        
        // return the created pascalTriangle
        return pascalTriangle;
    }
}
