// https://leetcode.com/problems/k-diff-pairs-in-an-array/description/
// Time Complexity : O(n^2)
// Space Complexity : O(n)

package S30_Codes.Competitive_Coding_3;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public int findPairs(int[] nums, int k) {
        int totalPairs = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i< nums.length-1; i++){
            for(int j=i+1; j< nums.length; j++){
                if( Math.abs(nums[i] - nums[j]) == k &&
                        !map.containsKey(Math.min(nums[i], nums[j])) ){

                    totalPairs++;
                    map.put(Math.min(nums[i], nums[j]), Math.max(nums[i], nums[j]));
                }
            }
        }

        return totalPairs;
    }
}

