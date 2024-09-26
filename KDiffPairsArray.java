class KDiffPairsArray {
    //O(11) space and O(nlogn time)
    public int findPairs(int[] nums, int k) {

        //check for any null cases or empty array
        if (nums == null || nums.length == 0) return 0;

        //Sorting the array Onlogn time
        Arrays.sort(nums);

        //1, 1, 1, 2, 2, 3, 4, 5
        //k = 3

        int p0 = 0;
        int p1 = 1;
        int count = 0;

        while (p1 < nums.length && p0 < nums.length) {

            //Case 1 where differene is equal to k
            if (nums[p1] - nums[p0] >= k) {
                if (nums[p1] - nums[p0] == k) {
                    count++;
                }
                p0++;
                while (p0 < nums.length && nums[p0] == nums[p0 - 1]) {
                    p0++;
                }
                p1 = p0 + 1;
            } else {
                p1++;
            }

        }

        return count;

    }
}