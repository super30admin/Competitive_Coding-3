/*
 ? Problem: K-diff Pairs in an Array
 * Time Complexity : O(nlogn)
 * Space Complexity : O(1)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No
*/

#include <vector>

class Solution {
public:
    int findPairs(std::vector<int>& nums, int k) {
        sort(nums.begin(), nums.end());
        int ans = 0, l = 0, r = 1, n = nums.size();

        while (l < n && r < n) {
            if (l == r || nums[r] - nums[l] < k) {
                r++;
            } else if (nums[r] - nums[l] > k) {
                l++;
            } else {
                ans++; l++;
                while (l < n && nums[l] == nums[l - 1]) {
                    l++; // Skip duplicates
                }
            }
            if (l >= r) r = l + 1;
        }

        return ans;
    }
};