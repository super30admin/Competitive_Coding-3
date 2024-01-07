// Given an integer numRows, return the first numRows of Pascal's triangle.
// In Pascal's triangle, each number is the sum of the two numbers directly above it.

// Example 1:
// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

// Example 2:
// Input: numRows = 1
// Output: [[1]]

const generate = (numRows) => {
  let pascalTriangle = [];
  for (let i = 0; i < numRows; i++) {
    let tempRow = [1]; //starting with row 1
    let prevRow = pascalTriangle[i - 1];
    for (let j = 1; j < i; j++) {
      // Used prevRow[j] || 0 to handle the case when j is at the end of the row, preventing undefined values.
      let currentRow = prevRow[j - 1] + (prevRow[j] || 0); //sum the previous row elements
      tempRow.push(currentRow);
    }
    if (i > 0) {
      tempRow.push(1); // end each row with 1
    }
    pascalTriangle.push(tempRow);
  }
  return pascalTriangle;
};

console.log(generate(5));

// Time Complexity : O(n^2), since we are running 2 for loops: outer for rows and inner for columns
// Space Complexity : O(n^2), in each row, there are i elements, and they are proportional to numRows.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Hard to understand space complexity in this case.
