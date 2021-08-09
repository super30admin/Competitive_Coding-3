// Time Complexity : O(NlogN)
// Space Complexity :O(1)

class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        if(nums.empty() || nums.size() == 0){
            return 0;
        }
        sort(nums.begin(), nums.end());
        int count=0, p1=0, p2=0;
        int n = nums.size();
        while(p1<n && p2<n){
            if(p1 == p2)
                p2++;
            else if(nums[p2] - nums[p1] < k)
                p2++;
            else if(nums[p2] - nums[p1] > k)
                p1++;
            else{
                count++;
                p1++;
                p2++;
                while(p2<n && nums[p2] == nums[p2-1]){
                    p2++;
                }
            }
        }
        return count;
    }
};
