//Time Complexity: O(n)
//Space Complexity:o(n)
//Did this code successfully run on Leetcode :Yes
class Solution {
public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length < 2 || k < 0) {
        return 0;
        }
        Arrays.sort(nums);
        int i = 0, j = 1, ans = 0;
        while (i < nums.length && j < nums.length) {
        while (i - 1 >= 0 && nums[i] == nums[i - 1] && i < j - 1) { //是i < j-1，不是i<j，否则[1,1,3,4,5]出错
        i++;
        }
        while (j + 1 <nums.length && nums[j] == nums[j + 1]) {
        j++;
        }
        if (nums[j] - nums[i] == k) {
        ans++;
        i++;
        j++;
        } else if (nums[j] - nums[i] < k) {
        j++;
        } else {
        i++;
        }
        if (i == j) {
        j++;
        }
        }
        return ans;
        }
        }