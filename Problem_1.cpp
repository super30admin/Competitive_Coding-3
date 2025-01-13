// Author: Subhed Chavan
// Batch: December 24
// Problem Statement: K-diff Pairs in an Array
// Approach: Hashing
// Time Complexity: O(n)

class Solution
{
public:
    int findPairs(vector<int> &nums, int k)
    {

        // Base Case
        if (nums.size() == 0 || nums.size() == 1)
        {
            return 0;
        }

        unordered_map<int, int> dp;
        int result = 0;

        for (int i = 0; i < nums.size(); i++)
        {
            dp[nums[i]] = dp[nums[i]] + 1;
        }

        for (auto i = dp.begin(); i != dp.end(); i++)
        {
            int element_2 = i->first + k;

            if (k == 0 && dp.find(element_2) != dp.end())
            {
                int element_2_second = dp.find(element_2)->second;
                if (element_2_second > 1)
                {
                    result++;
                }
            }
            else if (k >= 1 && dp.find(element_2) != dp.end())
            {
                result++;
            }
        }

        return result;
    }
};