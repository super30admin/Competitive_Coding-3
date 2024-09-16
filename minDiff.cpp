// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        vector<pair<int,int>> answer;
        for (int i=0;i<nums.size()-1;i++) {
            while (i>0 && nums[i]==nums[i-1])
                i++;
            
            int left=i;
            int right=nums.size()-1;
            while (left<right) {
                int diff=nums[right]-nums[left];
                if ( diff==k) {
                    answer.push_back({nums[left],nums[right]});
                    left++;
                    right--;
                    
                    while (left<right && nums[left]==nums[left-1]) {
                        left++;
                    }
                    while (left<right && nums[right]==nums[right+1]) {
                        right--;
                    }
                } else if (diff>k) {
                    right--;
                } else if (diff<k) {
                    left++;
                }
            }
        }
        return answer.size();
    }
};