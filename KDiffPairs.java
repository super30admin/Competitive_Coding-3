class KDiffPairs {
    public int findPairs(int[] nums, int k) {
        if(nums==null || nums.length ==0){
            return 0;
        }
        Arrays.sort(nums);
        int n = nums.length;
        int result = 0;
        int l=0, r=1;
        while(r<n && l<n){
            int value = nums[r] - nums[l];
            if(l == r || value < k) {
                r++;
            }
            else if(value == k){
                result++;
                l++;
                r++;

                while (l < nums.length && nums[l] == nums[l - 1])
                    l++;
            }
            else {
                l++;
            }
        }

        return result;
    }
}
