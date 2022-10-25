/*
Time Complexity: O(m*n)
Space Complexity: O(1)
Did this code successfully run on Leetcode :yes
Any problem you faced while coding this : no
*/
class Solution {
public:
    vector<vector<int>> generate(int n) {
        vector<vector<int>> ans;
        ans.push_back({1});
        for(int i = 1; i<n;i++){
            vector<int> tempans;
            tempans.push_back(1);
            for(int j = 1; j<i;j++){
                int val1 = ans[i-1][j-1];
                int val2 = ans[i-1][j];
                tempans.push_back(val1 + val2);
            }
            tempans.push_back(1);
            ans.push_back(tempans);
        }
        return ans;
    }
};