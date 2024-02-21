//Time Complexity - O(n)
//Space Complexity - O(n)
//Did This code run successfully on Leetcode - Yes
//Approach - Create a Frequency map for the input array. Iterate the keys of the map and check if the complement number exists in the map.

import java.util.HashMap;

class Solution {
    public int findPairs(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int diffComp = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {

            diffComp = key + k;

            if (k > 0) {
                if (map.containsKey(diffComp)) {
                    count++;
                }
            } else if (k == 0 && map.get(diffComp) >= 2) {
                count++;
            }
        }

        return count;
    }
}