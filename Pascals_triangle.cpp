// Time Complexity: O(n^2)
// Space Complexity: O(n)
// Did this code successfully run on Leetcode : Yes

//Approach:
// 1. Create a 2D vector to store the pascal's triangle.
// 2. Resize the vector to the number of rows.
// 3. Initialize the first and last element of each row to 1.
// 4. For the rest of the elements in the row, calculate the sum of the previous row's elements at the same index and the previous index.

class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>>answer(numRows);
        for(int rows = 0; rows < numRows; rows++){
            answer[rows].resize(rows+1);
            answer[rows][0] = 1;
            answer[rows][rows] = 1;
            for(int columns = 1; columns < rows;columns++){
                answer[rows][columns] = answer[rows-1][columns-1] + answer[rows-1][columns];
            }
        }
        return answer;
    }
};