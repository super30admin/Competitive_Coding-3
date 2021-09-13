// Time Complexity : O(nlogn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
import java.util.*;
public class pairs {
    public int findPairs(int[] nums, int k) {
    Arrays.sort(nums);
        int left = 0, right = 1;
        int count = 0;
        int i1 = Integer.MIN_VALUE, i2 = Integer.MIN_VALUE;
        while(right<nums.length) {
            int dif = Math.abs(nums[right]-nums[left]);
            if(right == left) right++;
            else if(dif==k) {
                if(i1 != nums[left] && i2 != nums[right]){
                    i1 = nums[left];
                    i2 = nums[right];
                    count++;
                    }
                right++;
            }
            else if(dif < k) right++;
            else left++;
        }
        return count;
}   
}
