class Solution {
public:
    vector<vector<int>> generate(int n) {
       vector<vector<int>> ans;
        vector<int> t;
        if( n >= 1){
            t.push_back(1);
        }
        
        ans.push_back(t);
        
         for(int i=2; i<=n; i++){
             vector<int> temp;
             for(int j = 0; j<i; j++){
                 if(j==0 || j==i-1){
                     temp.push_back(1);
                 }else{
                     temp.push_back(ans[i-2][j-1] + ans[i-2][j]);
                 }
             }
             ans.push_back(temp);
         }
        
        
        
        return ans;
    }
};

// Ran on leetcode: all test cases passed
// Time Complexity: O(n^2) Where n is the number of rows.
// Space Complexity: o(n^2)
