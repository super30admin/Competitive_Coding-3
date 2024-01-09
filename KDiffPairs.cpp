// Time Complexity : O(n)
// Space Complexity :O(n)

#include <bits/stdc++.h>

using namespace std;

class Solution
{
public:
    int findPairs(vector<int> &nums, int k)
    {
        set<pair<int, int>> uniquePairs;

        set<int> hset;

        for (int num : nums)
        {
            int value1 = num + k;
            int value2 = num - k;

            if (hset.find(value1) != hset.end())
            {
                if (num < value1)
                    uniquePairs.insert({num, value1});
                else
                    uniquePairs.insert({value1, num});
            }

            if (hset.find(value2) != hset.end())
            {
                if (num < value2)
                    uniquePairs.insert({num, value2});
                else
                    uniquePairs.insert({value2, num});
            }

            hset.insert(num);
        }

        return uniquePairs.size();
    }
};