// Time Complexity : O(nlogn) where n is the number of elements in nums
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/* We use 2 pointer approach to decrease our complexity from O(n^2) to O(nlogn). We sort that array and
   set lo to 0 and hi to 1. Whenever diff < k then it means we have to increase it so he do hi++ else we do
   lo++ to decrease the diff. When diff = k we add 1 to our counter. Also to avoid duplicates we keep on incrementing
   lo++ till arr[lo] == arr[lo - 1]. In the end the count is returned.
*/

class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return -1;
        
        Arrays.sort(nums);
        int lo = 0, hi = 1;

        int count = 0;

        while(lo < nums.length && hi < nums.length) {
            int diff = nums[hi] - nums[lo];

            if(lo == hi || diff < k)
                hi++;
            else if(diff > k)
                lo++;
            else {
                count++;
                lo++;
                while(lo < nums.length && nums[lo] == nums[lo - 1])
                    lo++;
                while(hi < nums.length && nums[hi] == nums[hi - 1])
                    hi++;
            }
        }
        return count;
    }
}