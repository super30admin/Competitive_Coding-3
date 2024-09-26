//time complexity: O(n^2)
//space complexity:O(n)
//approach: using dynamic prog.
//solved on leetcode? yes
//problem faced? no

class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>>res;
        if(numRows==0)
            return res;
        if(numRows==1)
        {
            res.push_back({1});
            return res;
        }
        res.push_back({1});
        res.push_back({1,1});
        if(numRows==2)
            return res;
        for(int i=2;i<numRows;i++)
        {
            vector<int>temp(i+1,1);
            for(int j=1;j<i;j++)
            {
                temp[j]=res[i-1][j-1]+res[i-1][j];
            }
            res.push_back(temp);
        }
        return res;
    }
};