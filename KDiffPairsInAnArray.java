// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.Arrays;

public class KDiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        Arrays.sort(nums);
        int j = 0;
        for(int i=0; i < nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

            j = Math.max(j, i+1);
            while(j < nums.length){
                if(Math.abs(nums[i] - nums[j]) == k){
                    count++;
                    break;
                } else if(Math.abs(nums[i] - nums[j]) < k){
                    j++;
                } else {
                    break;
                }
            }
        }

        return count;
    }
}
