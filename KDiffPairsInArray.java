//Time Complexity: O(N)
//Space Complexity: O(1)
class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        int count = 0;
        int n1 = Integer.MIN_VALUE;
        int n2 = Integer.MAX_VALUE;
        while(right < nums.length)
        {
            int diff = Math.abs(nums[right] - nums[left]);
            if(left == right) right++;
            else if(k == diff)
            {
                if(n1 != nums[left] && n2 != nums[right])
                {
                    n1 = nums[left];
                    n2 = nums[right];
                    count++;
                }right++;

            }
            else if(diff < k) right++;

            else left++;
        }return count;
    }
}