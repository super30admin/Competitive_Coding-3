#include <iostream>
#include <algorithm>
#include <vector>

using namespace std; 

class Solution {
public:
    int findPairs(vector<int>& nums, int k) 
    {
        sort(nums.begin(), nums.end()); 
        
        int a = 0, b = 1, count = 0;
        
        while(a < nums.size() && b < nums.size())
        {
            if(a==b || nums[a] + k > nums[b])
                b++;
            else if(nums[a] + k < nums[b])
                a++;
            else
            {
                a++;
                count++;
                
                while(a < nums.size() && nums[a] == nums[a-1])
                    a++;
            }   
        }
        
        return count;
    }
};