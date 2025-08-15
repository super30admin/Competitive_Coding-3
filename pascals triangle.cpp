class Solution {//tc:o(numRows^2) sc:o(1)
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>>result;
        result.resize(numRows);
       
        for(int i = 0;i<numRows;i++)
        {
           result[i].resize(i+1);
           result[i][0]=1; // first elememt
           result[i][i]=1; // last element
        
           for(int j=1;j<i;j++)
           result[i][j]=result[i-1][j-1]+result[i-1][j];
         
            
        }
        return result;
    }
};