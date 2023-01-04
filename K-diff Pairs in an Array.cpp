// TC = O(N)
// SC = O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        // null
        if(nums.size() < 2 || k < 0) return 0;
        unordered_map<int, int> m;
        int count = 0;
        for(int i = 0; i < nums.size(); i++) m[nums[i]]++;
        for(pair p : m) {
            // for k = 0, searching for a different nums & for k > 0 finding the complement nums[i] + k, no need to check for nums[i] - k as we are itertating through each of nums
            if((k == 0 && p.second > 1) || (k > 0 && m.count(p.first + k) > 0))
                count++;
        }
        return count;
    }
};