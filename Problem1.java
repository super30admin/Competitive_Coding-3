// Problem 1: Pascal's Triangle
//Leetcode : https://leetcode.com/problems/pascals-triangle/description/

/*
    Approach:
    The algorithm generates each row of Pascal's Triangle based on the previous row.
    - Each row starts and ends with 1.
    - Every other element at index 'j' in row 'i' is the sum of elements at 'j-1' and 'j' from row 'i-1'.
    - We use a nested loop: the outer loop iterates through the number of rows, and the inner loop constructs each row.

    Time Complexity: O(numRows^2)
    - We have two nested loops. The outer loop runs 'numRows' times.
    - The inner loop runs 'i' times for each row, resulting in 1 + 2 + 3 + ... + numRows operations, which simplifies to O(numRows^2).

    Space Complexity: O(1)
    - If we don't count the space required for the result list itself, we only use a few constant pointers and variables.
    - If counting the output, it is O(numRows^2) to store the generated elements.
*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        // store the final result
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>(); // this is the list to for each row
            for (int j = 0; j <= i ; j++){
                if(j == 0 || j == i){
                    row.add(1);
                }else{
                    Integer left = result.get(i-1).get(j-1);
                    Integer right = result.get(i-1).get(j);
                    row.add(left + right);
                }

            }
            result.add(row);
        }
        return result;
    }
}