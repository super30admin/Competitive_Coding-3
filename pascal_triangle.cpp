// Time Complexity : O(n)
// Space Complexity :  O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this

class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        
        vector<vector<int>> ret_vect;
        int i, j;
        int num;
        
        vector<int> temp1;
        temp1.push_back(1);
        ret_vect.push_back(temp1);

        // Length 1 condition    
        if(numRows == 1)
        {
            return ret_vect;
        }
        
        vector<int> temp2;
        temp2.push_back(1);
        temp2.push_back(1);
        ret_vect.push_back(temp2);

        // Length 2 condition    
        if(numRows == 2)
        {
            return ret_vect;
        }
        
        // Length > 2
        for(i = 2; i < numRows; i++)
        {
            vector<int> temp;
            temp.push_back(1);
            
            // Add the values other than 1
            for(j = 1; j <= i-1; j++)
            {
                num = ret_vect[i-1][j-1] + ret_vect[i-1][j];
                temp.push_back(num);
            }
            
            temp.push_back(1);
            
            ret_vect.push_back(temp);
        }
        
        return ret_vect;
    }
};