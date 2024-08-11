// Problem 532. K-diff Pairs in an Array
// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
import java.util.Arrays;

public class FindPairs {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        int result = 0;
        while(right < nums.length){
            if(left == right || nums[right] - nums[left] < k){
                right++;
            }else if(nums[right] - nums[left] > k){
                left++;
            }else{
                result++;
                left++;
                right++;
                while(right < nums.length && nums[right] == nums[right-1]){
                    right++;
                }
            }
        }
        return result;
    }
}
