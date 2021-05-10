/*
Time complexity - O(N^2)
Space complexity - O(1)
*/
class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        if (numRows == 0) return {{}};
        vector<vector<int>> res;
        int row = 0;
        while (row < numRows){
            vector<int> temp;
            for (int j = 0; j <= row; ++j){
                if (j == 0 || j == row) temp.push_back(1);
                else{
                    temp.push_back(res[row - 1][j - 1] + res[row - 1][j]);
                }
            }
            res.push_back(temp); ++row;
        }
        return res;
    }
};