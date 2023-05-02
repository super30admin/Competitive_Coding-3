// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

// we observe a pattern that first and last elements are same and middle elements(given operation should be performed)
// we use curr array to store the result of that particular row and add it to the result. we reuse the same curr array untill the process ends.


class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>>result;
        vector<int>v;
        vector<int>curr;
        v.push_back(1);
        result.push_back(v);
        for(int i=2;i<=numRows;i++)
        {
            curr.clear();
            curr.push_back(v[0]);
            for(int j = 1;j<v.size();j++)
            {
                curr.push_back(v[j-1]+v[j]);
            }
            curr.push_back(v[v.size()-1]);
            
            result.push_back(curr);
            v = curr;
        }
        return result;
        
    }
};