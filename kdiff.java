// Time Complexity : o(N)
// Space Complexity :o(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findPairs(int[] nums, int k) {
        // Create a HashMap to store the frequency of each number in the array
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int result = 0;

        // Iterate through the entries in the map
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            // If k is greater than 0, check if (key + k) exists in the map
            if (k > 0 && map.containsKey(key + k)) {
                result++;
            } 
            // If k is 0, check if there are duplicates of the current key
            else if (k == 0 && value > 1) {
                result++;
            }
        }

        return result;
    }

}
