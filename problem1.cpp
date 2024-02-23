// 118. Pascal's Triangle
// Time Complexity : O(n*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
iterates through each row, from the first row to the specified number of rows. Within each row, iterates through each position, 
calculating the value based on the sum of the two values from the previous row. Special handling is done for the first and last 
elements of each row, where they are initialized with 1, as they are always 1 in Pascal's triangle. Finally, 
returns the generated triangle as a vector of vectors.

*/
vector<vector<int>> generate(int numRows) {
    vector<vector<int>> ans;
    for(int i = 0; i < numRows; i++)
    {
        for(int j = 0; j <= i; j++)
        {
            if(j==0)
                ans.push_back({1});
            else if(j == i)
                ans[i].push_back(1);
            else
                ans[i].push_back(ans[i - 1][j - 1] + ans[i-1][j]);
        }
    }
    return ans;
}