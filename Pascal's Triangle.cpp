// time: O(numRows^2)
// space: O(1)

class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> result;        
        for(int i = 1; i <= numRows; i++) {
            vector<int> row;            
            row.push_back(1);
            if(i > 1) {
                for(int k = 0; k < result[i-2].size()-1; k++) {
                    row.push_back(result[i-2][k]+result[i-2][k+1]);
                }                
            }
            if(i != 1) {
                row.push_back(1);
            }
            result.push_back(row);
        }        
        return result;
    }
};