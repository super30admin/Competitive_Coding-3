

// Time Complexity : O (n*m)
// Space Complexity : O (n*m)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution
{
public:
    vector<vector<int>> generate(int numRows)
    {
        if (numRows < 0)
        {
            return {};
        }

        // dp array to store the pattern
        vector<vector<int>> dp(numRows);

        // initialize the initial 1
        dp[0].push_back(1);

        for (int i = 1; i < numRows; i++)
        {
            dp[i].push_back(dp[i - 1][0]);
            for (int j = 0; j < dp[i - 1].size(); j++)
            {
                // if the jth index is greater than the size to store the opening/ closing 1's
                if (j + 1 >= dp[i - 1].size())
                {
                    dp[i].push_back(dp[i - 1][0]);
                }
                else
                {
                    // store the sum of adjacent from the prev
                    dp[i].push_back(dp[i - 1][j] + dp[i - 1][j + 1]);
                }
            }
        }

        return dp;
    }
};