//time complexity : o(n2) and space o(1);
class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        
        vector<vector<int>> V;
        
        for(int i =0;i<numRows;i++) {
            
            vector<int> row;
            for(int j = 0; j<=i;j++) {
                
                if(j ==0 || j==i) {
                    row.push_back(1);
                } else {
                    row.push_back(V[i-1][j] + V[i-1][j-1]);
                }
            }
            
            V.push_back(row);
        }
        
        return V;
    }
};