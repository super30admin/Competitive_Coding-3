// Time Complexity : O(n^2); n is number of rows
// Space Complexity : O(n^2); 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// 1. Maintain curr row and prev row such that first and last element of curr row is always 1
// 2. For each row from second, calculate each element in row as per previous row element as = prev_row[j-1] + prev_row[j];
// 3. Place curr in result and make prev = curr   

class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> result;
        if(numRows == 0) return result;
        vector<int> row;
        vector<int> prev_row;
        prev_row.emplace_back(1);
        result.emplace_back(prev_row);
        
        for(int i=1;i<numRows;i++){
            row.clear();
            row.emplace_back(1);
            for(int j=1;j<i;j++){
                int sum = prev_row[j-1] + prev_row[j];
                row.emplace_back(sum);
            }
            row.emplace_back(1);
            result.emplace_back(row);
            prev_row = row;
        }
        
        return result;    
    }
};