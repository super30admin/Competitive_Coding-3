//Time complexity : O(n-square)
//Space complexity : O(1)

//Approach:
            // Get number of rows
            // Fill first and last element of row with 1
            // Calculate middle elements using elements of the last rows

class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        if(numRows == 0)
            return {};
        
        vector<vector<int>> ret(numRows, vector<int>(0,0));
        
        ret[0].push_back(1);
        
        for(int i = 1; i < numRows; i++)
        {
            ret[i].resize(i + 1);
            ret[i][0] = 1;
            ret[i][ret[i].size() - 1] = 1;
            for(int j = 1; j < ret[i].size() - 1; j++)
            {
                ret[i][j] = ret[i - 1][j - 1] + ret[i - 1][j];
            }
        }
        
        return ret;
    }
};