// Time Complexity : O(N) where N is size of nums array
// Space Complexity : O(N) where N is size of nums array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope
// Problem Link: https://leetcode.com/problems/k-diff-pairs-in-an-array/
// Submission Link: https://leetcode.com/submissions/detail/535322394/

class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        unordered_map<int, int> nums_count;
        
        for(int i = 0; i < nums.size(); i++){
            nums_count[nums[i]]++;
        }
        
        int key, value;
        int ans = 0;
        
        for(unordered_map<int, int>::iterator it = nums_count.begin(); it != nums_count.end(); it++){
            key = it -> first;
            value = it -> second;
            
            if(k == 0){
                if(nums_count[key + k] > 1)
                    ans++;
            }
            else{
                if(nums_count.find(key + k) != nums_count.end())
                    ans++;
            }
        }
        
        return ans;
    }
};