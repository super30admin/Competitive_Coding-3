// https://leetcode.com/problems/pascals-triangle/description/
// Time Complexity : O(n^2) where n is the input number
// Space Complexity : O(n) auxiliary space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// for each row, iterate from 0 to i.
// First and last indices are always 1.
// The middle one is the summation of [i-1][j-1] + [i-1][j]



class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> ans;
        for(int i=0; i<numRows; i++){
            vector<int> res;
            for(int j=0; j<=i; j++){
                if(j==0 || j==i) res.push_back(1);
                else res.push_back(ans[i-1][j-1] + ans[i-1][j]);
            }
            ans.push_back(res);
        }
        return ans;
    }
};
