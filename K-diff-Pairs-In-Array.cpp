// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes

class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        int count = 0;
        int slow = 0;
        int fast = 0;
        int n = nums.size();
        while(slow<n && fast<n){
            if(slow == fast || nums[fast]-nums[slow]<k){
                fast++;
            }
            else if(nums[fast]-nums[slow]>k){
                slow++;
            }
            else{
                count++;
                slow++;
                fast++;
                while(fast < n && nums[fast]==nums[fast-1]){
                    fast++;
                }
            }
        }
        return count;
    }
};
