//Time complexity - O(n) n-number of elements in the triangle 
//Space complexity - O(n) 

class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> ret;
        int rowNum = 2;
        vector<int> rows;
        
        if(numRows == 0) return ret;
        ret.push_back({1});
        
        while(rowNum<=numRows){
            
            
            rows.push_back(1);
            for(int i=1;i<rowNum-1;i++){
                rows.push_back(ret[rowNum-2][i-1]+ret[rowNum-2][i]);
            }
            rows.push_back(1);
            ret.push_back(rows);
            rows.clear();
            rowNum++;
            
        }
        
        return ret;
        
    }
};