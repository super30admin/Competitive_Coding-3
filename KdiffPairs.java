// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.*;

public class KdiffPairs {
 
    public int findPairs(int[] nums, int k) {
        
        if(nums == null || nums.length == 0) {
            return 0;
        }
        
        int left = 0, right = 1, result = 0;
        Arrays.sort(nums);
        
        while(left  < nums.length && right < nums.length) {
            
            int sum = Math.abs(nums[right] - nums[left]);
            
            if(left == right || sum < k) {
                right++;
            } else if(sum > k) {
                left++;
            }else {
                left++;
                result++;
            }
        }
        return result;
    }
}
