/* Pascal's Triangle */

// Time Complexity : O(n^2), where n = numRows
// Space Complexity : O(1) auxiliary space, O(n^2) is the size of the output
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// The first and second rows will always be [1] and [1,1] respectively
// For each row, we need to calculate the elements between index 0 and index i-1, which is given by the formula: row[j] = triangle[i-1][j-1] + triangle[i-1][j]
// After we fill a row, push it into the triangle matrix at the appropriate index

class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> triangle(numRows);
        for(int i=0; i<numRows; i++) {
            vector<int> row(i+1, 1);
            for(int j=1; j<i; j++) {
                row[j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
            triangle[i] = row;
        }
        return triangle;
    }
};