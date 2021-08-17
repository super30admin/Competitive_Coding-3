// Time Complexity : O(N ^ 2) where N is the number of rows
// Space Complexity : O(N ^ 2) where N is the number of rows
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope
// Problem Link: https://leetcode.com/problems/pascals-triangle/
// Submission Link: https://leetcode.com/submissions/detail/539873691/

class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int> > ans;
        
        ans.push_back({1});
        if(numRows == 1)
            return ans;
        
        ans.push_back({1, 1});
        if(numRows == 2)
            return ans;
        
        for(int i = 2; i < numRows; i++){
            ans.push_back({1});
            for(int j = 1; j < ans[i-1].size(); j++)
                ans[i].push_back(ans[i-1][j-1] + ans[i-1][j]);
            ans[i].push_back(1);
        }
        
        return ans;
    }
};