// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes 
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
// Idea here is to store all elements frequency into map and then find complement pair
// in the map. We handle the 0th case by checking if there is an element with frequency 2 in the map.

#include<vector>
#include<unordered_map>

class Solution {
public:
    int findPairs(std::vector<int>& nums, int k) {
        std::unordered_map<int, int> res;
        int result = 0;

        for(int i = 0; i <nums.size(); i++)
        {
            res[nums[i]]++;
        }

        for(auto x : res)
        {
            if( k == 0)
            {
                if(x.second > 1)
                {
                    result++;
                }
            }
            else if(res.find((x.first+k)) != res.end())
            {
                result++;
            }
        }
        return result;
        
    }
};