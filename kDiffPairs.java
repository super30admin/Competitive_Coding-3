// Time Complexity : O(nlogn)
// Space Complexity : O(n1)
// Use pointers approach
// Sorted the array first
// took left as 0 and right as 1 and incremented the values of left and right based on difference

class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0)
            return 0;
        int count = 0;
        int left = 0, right = 1;
        Arrays.sort(nums);

        while (left < nums.length && right < nums.length) {
            if (left == right || nums[right] - nums[left] < k)
                right++;
            else if (nums[right] - nums[left] > k)
                left++;
            else {
                left++;
                count++;
                while (left < nums.length && nums[left] == nums[left - 1])
                    left++;
            }

        }
        return count;
    }
}