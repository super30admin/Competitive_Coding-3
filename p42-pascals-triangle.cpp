//Time Complexity : O(n^2) - n = numRows
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> res;
        
        for(int i = 0; i < numRows; i++){
            vector<int> temp;
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    temp.push_back(1);
                }
                else{
                    temp.push_back(res[i-1][j-1] + res[i-1][j]);
                }
            }
            res.push_back(temp);
        }
        return res;
    }    
};
