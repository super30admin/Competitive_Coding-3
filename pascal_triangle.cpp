// Time Complexity :O(n^2)
// Space Complexity :O(n^2)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
// simply use the result of the previous row to generate the next
// always push 1 to the beginning and end of the temp array


class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> res;
        for(int i=0;i < numRows;i++){
            vector<int>temp;
            for(int j = 0;j<=i;j++){
                if(j==0 || j== i){
                    temp.push_back(1);
                }else{
                    temp.push_back(res[i-1][j] + res[i-1][j-1]) ;
                }
            
            }
            res.push_back(temp);
        }
        return res;
    }
};