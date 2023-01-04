// TC = O(N2)
// SC = O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> res;
        for(int i = 0; i < numRows; i++) {
            vector<int> row;
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) row.push_back(1);
                else { 
                    // visualize left & right how it comes from the row above
                    int left = res[i - 1][j - 1];
                    int right = res[i - 1][j];
                    row.push_back(left + right);
                }
            }
            res.push_back(row);
        }
        return res;
    }
};