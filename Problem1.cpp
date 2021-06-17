// Time Complexity : O(n^2)
// Space Complexity : O(1) the matrix is not considered as it is being returned
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Pascal's Traingle

#include<iostream>
#include<vector>

using namespace std;
class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        
        vector<vector<int>> result(numRows);
        
        for(int i = 0; i < numRows; i++){
            result[i].resize(i + 1);    // add a column 
            
            result[i][0] = 1;
            result[i][result[i].size() - 1] = 1;    
            
            for(int j = 1; j < result[i].size() - 1; j++){
                result[i][j] = result[i - 1][j - 1] + result[i - 1][j];     // add the prev column and current column
            }
        }
        
        return result;
       
    }
};

 