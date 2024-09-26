//Time Complexity = O(N*N)
//Space Complexity = O(1)
//Where N is the number of rows upto which the pascals triangle has to be formed.
class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> ans;
        int i,j;
        for(i=0;i<numRows;i++)
        {
            vector<int> temp;
            for(j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                    temp.push_back(1);                                          
                else
                    temp.push_back(ans[i-1][j-1]+ans[i-1][j]);
            }
            ans.push_back(temp);
        }
        return ans;
    }
};
