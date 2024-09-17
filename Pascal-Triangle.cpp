// Time Complexity : O(N^2)
// Space Complexity : O(N^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes

class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> result;
        for(int i=0;i<numRows;i++){
            vector<int> row;
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.push_back(1);
                }
                else{
                    int left = result[i-1][j-1];
                    int right = result[i-1][j];
                    row.push_back(left+right);
                }
            }
            result.push_back(row);
        }
        return result;
    }
};
