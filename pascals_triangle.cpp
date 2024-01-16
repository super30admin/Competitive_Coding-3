// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : yes 
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// Idea is to calculate the current row values based on previous row values. 

#include<vector>

class Solution {
public:
    std::vector<std::vector<int>> generate(int numRows) {
        std::vector<std::vector<int>> result;

        result.push_back({1});
        if(numRows == 1)
        {
            return result;
        }

        result.push_back({1,1});

        for(int r = 2; r < numRows; r++)
        {
            std::vector<int> prevRow = result[r-1];
            std::vector<int> temp;
            temp.push_back(1);
            for(int i = 1; i < r; i++)
            {
                temp.push_back(prevRow[i-1] + prevRow[i]);
            }
            temp.push_back(1);
            result.push_back(temp);
        }
        return result;
    }
};