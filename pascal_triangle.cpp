//Time O(nxm)
//Space O(n)
//Leetcode yes
//Issue seen: none
class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>>result;

        for(int i=0; i<numRows; i++){
            vector<int>row(i+1, 1);
            for(int j=1; j<i; j++){
                row[j] = result[i-1][j] + result[i-1][j-1];
            }
            result.push_back(row);
            row.clear();
        }
        return result;
    }

/*
    //using dp
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>>result;
        vector<int>prev;

        for(int i=0; i<numRows; i++){
            vector<int>row(i+1, 1);
            
            for(int j=1; j<i; j++){
                row[j] = prev[j] + prev[j-1];
            }
            result.push_back(row);
            prev = row;
            row.clear();
        }
        return result;
    }
    */
};
