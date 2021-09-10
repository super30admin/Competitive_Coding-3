class KdiffPairs {

    public int findParis(int nums[], int k) {
        Arrays.sort(nums);
        int count = 0, slow = 0, fast = 0;
        int n = nums.length;
        while (slow < n && fast < n) {
            // case 1
            if (slow == fast || nums[fast] - nums[slow] < k)
                fast++;
            // case2
            else if (nums[fast] - nums[slow] > k)
                slow++;
            // case3
            else {
                count++;
                slow++;
                fast++;
                while (fast < n && nums[fast] == nums[fast - 1])
                    fast++;

            }

        }

        return count;

    }
}

// TC: O(n) SC:O(1)
