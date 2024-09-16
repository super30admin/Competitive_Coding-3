// Time Complexity : O(n log n)
// Space Complexity : O(1) no extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Unique Pairs

#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;
class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        
        if(nums.empty())    // null case
            return 0;
        
        sort(nums.begin(),nums.end());  //sorting the array
        
        int count = 0;
        int slow = 0;
        int fast = 0;
        while(slow < nums.size() && fast < nums.size()){
            
            if(slow == fast || nums[fast] - nums[slow] < k)
                fast++;
            else if(nums[fast] - nums[slow] > k)
                slow++;
            else{
                count++;
                slow++;
                fast++;
                while(fast < nums.size() && nums[fast] == nums[fast - 1])
                    fast++;
            }
        }
        
        return count;
    }
};