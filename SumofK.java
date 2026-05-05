// Time Complexity :    o(n) where n is the number of elements in the input array
// Space Complexity : O(n) where n is the number of unique elements in the input array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// We can use a HashMap to store the frequency of each number in the input array as we need uniqy pairs and
//  we can easily check if the pair exists in the map
// We can iterate through the map and check for each key if the pair (key + k) exists in the map
// If k is 0, we need to check if the frequency of the key is greater than 1 to count it as a valid pair,
//  otherwise we can simply check if the pair exists
// We can keep a count of valid pairs and return it at the end
import java.util.*;

class Solution {
    public int findPairs(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        // build frequency map
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // check pairs
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int key = entry.getKey();
            int value = entry.getValue();

            if (k == 0 && value > 1) {
                count++;
            }
            else if (k != 0 && map.containsKey(key + k)) {
                count++;
            }
        }

        return count;
    }
}