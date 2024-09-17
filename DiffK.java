class Solution {
    //11345
    public int findPairs(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int n = nums.length;
        int count=0;
        Arrays.sort(nums);
        while (r < n)
        {
            int diff = Math.abs(nums[r]-nums[l]);
            if (diff== k && l!=r)
            {
                l++;
                r++;
                count++;
            }
            else if(diff > k)
            {
                l++;
            }
            else{
                System.out.println(r);
                r++;
            }
        }
        return count;
    }
}