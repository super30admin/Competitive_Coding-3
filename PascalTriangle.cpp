//TC: O(n2)
//SC: O(n)

class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        
        vector<vector<int>> result;

        for (int i =0; i< numRows;i++)
        {
            vector<int> row;
            for(int j = 0; j <= i ; j++)
            {
                if (j==0 || j == 1) 
                {
                    row.push_back(1);
                }              
                else
                {
                    int left = result[i-1][j-1];
                    int right = result[i-1][j];
                    row.push_back(left+right);
                }
            }
            result.push_back(row);
        }
        return result;
    }
};