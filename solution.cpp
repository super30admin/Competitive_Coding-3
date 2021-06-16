//Here's my solution to the problem,I made error when I did 0 check iin beginning in original code, rectified it here
//O(nlogn)+ O(1) solution
class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        sort(nums.begin(), nums.end());
        auto i = 0, j = 1, pairs = 0;
        while (j < nums.size()) {
            if (nums[j] - nums[i] == k) {
                pairs++;
                i++;
                j++;
            }
            else if (nums[j] - nums[i] < k) j++;
            else i++;
            while (i > 0 && i < nums.size() && nums[i - 1] == nums[i]) i++;
            j = max(j, i + 1);
        }
        return pairs;
    }
};
