
// Time Complexity : O(nlogn) // sorting first then traversing arr
// Space Complexity : O(1) // no extra space 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


class Solution {
    public int findPairs(int[] nums, int k) {
       
      //edge case
      if(nums == null || nums.length == 0 || k<0) {
        return 0;
      }
      
      int count = 0;
      //sort the array
      Arrays.sort(nums);
      int slowPtr = 0;
      int fastPtr = 0;
      
      
      while(slowPtr < nums.length && fastPtr < nums.length) {
        int diff = nums[fastPtr] - nums[slowPtr];
        if(slowPtr == fastPtr || diff < k) { //case 1 diff is less move fast ptr
          fastPtr ++;
        } else if(diff > k) { // case 2 diff is more move the slow pter
          slowPtr ++;
        } else { // found the diff k pairs
            slowPtr ++;
            fastPtr++;
            count++;
            //check for uniqueness
            while(fastPtr < nums.length && nums[fastPtr] == nums[fastPtr-1]) {
            fastPtr++;
          }
        }
      }
      return count;
    }
}