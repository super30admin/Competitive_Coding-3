/* K-Diff Pairs */

// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// Sort the array and then start pointer i at index 0 and pointer j at index 1
// Check the difference nums[j] - nums[i]: if the diff is too big then move i forward, else move j forward
// When we find the pair, increment ans and then increment i & j to the next unique element
// When we increment i & j to the next unique element, we might end up with i & j at the same index, so put an if condition at the start of the loop to handle this

class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        int n = nums.size();
        if (n == 1) return 0;

        sort(nums.begin(), nums.end());
        int ans = 0;
        int i = 0; int j = 1;

        while(i < n && j < n) {
            if (i == j) { // to ensure distinct indices
                j++;
                continue;
            }
            int a = nums[i];
            int b = nums[j];
            if(b - a == k) { // we found a pair
                ans++;
                while(i < n && nums[i] == a) i++; // to ensure no duplicate pairs
                while(j < n && nums[j] == b) j++;
            }
            else if(b - a < k) { // diff is too small, increase j
                j++;
            } else { // diff is too big, increase i
                i++;
            }
        }

        return ans;
    }
};