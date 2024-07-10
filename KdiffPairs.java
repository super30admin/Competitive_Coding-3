/**
 * Time complexity: O(n)
 * Space complexity: O(n)
 */

import java.util.*;
class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {

            if(k == 0) {
                if(entry.getValue() >= 2)
                    count++;
            }
            else {
                if(map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }

        }
        return count;

    }
}