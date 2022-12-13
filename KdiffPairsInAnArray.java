// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach

import java.util.*;

public class KdiffPairsInAnArray {
    
        public int findPairs(int[] nums, int k) {
    
            if (nums == null || nums.length == 0) return 0;
    
            int cnt = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums){
                map.put(num, map.getOrDefault(num,0)+1);
            }
    
            for (int num : map.keySet()){
                if (k != 0){
                    if (map.containsKey(num-k)){
                        cnt++;
                    }
                } else {
                    if (map.get(num) > 1) cnt++;
                }
    
            }
            return cnt;
    
        }
    
    
}
