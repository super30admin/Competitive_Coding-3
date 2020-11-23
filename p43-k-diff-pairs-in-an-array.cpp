//Time Complexity : O(n) - n = size of the array
//Space Complexity : O(n) - unordered_map is used 
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        unordered_map<int, int> mp;
        int res = 0;
        for(int i = 0; i < nums.size(); i++) {
            mp[nums[i]]++;
        }
        
        for(auto it : mp) {
            if(k == 0) {
                if(it.second > 1)
                    res++;
            }
            else {
                if(mp.find(it.first+k) != mp.end())
                    res++;
            }
        }
        return res;
    }
};
