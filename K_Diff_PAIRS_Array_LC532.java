/*
Time Complexity - O(2N) ~ O(N)
Space complexity - O(N)
Did this code successfully run on Leetcode :  Yes
Any problem you faced while coding this :  No
*/

import java.util.HashMap;
import java.util.Map;

public class K_Diff_PAIRS_Array_LC532 {

    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        if (k < 0) return 0; // k must be non-negative

        for(int num : nums) {
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey(); // 2 - 1
            if(k == 0){
                // Count duplicates when k == 0
                if (entry.getValue() >= 2) count++;
            } else {
                // Check if num + k exists in the map
                if (map.containsKey(num + k)) count++;
            }
        }
        return count;
    }
}