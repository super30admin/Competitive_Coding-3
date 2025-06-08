/*
Time Complexity : O(N) where N is the number of elements in the array.
Space Complexity : O(N) for the HashMap to store the frequency of each number.
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Intuition: I used a HashMap to store the frequency of each number in the array.
Taking the absolute difference of the numbers, I checked if the number + k exists in the map.
*/

import java.util.*;

public class KPairsDiff {
    public int findPairs(int[] nums, int k) {
        if (k < 0)
            return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : map.keySet()) {
            if (k == 0) {
                if (map.get(num) > 1) {
                    count++;
                }
            } else {
                if (map.containsKey(num + k)) {
                    count++;
                }
            }
        }

        return count;
    }
}
