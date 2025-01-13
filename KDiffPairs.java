
// Using a hashmap to store all the values as key and their frequency as the value. Then iterating through hashmap, for each key, 
// check if nums[i]-k==key and the key is not negative indicating that this is the first time we are visiting this key, increment 
// the counter. Handle differently for k=0, check if any key in hashmap is having value >=2, that means that is pair that will give 
// difference as 0, so increment counter. Return counter

// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
import java.util.*;

class Solution {
    public int findPairs(int[] nums, int k) {
        // Declaring hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        // Iterate through nums and add all the values as keys in hashmap and there
        // frequency as value
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        }
        // System.out.println(map);
        // Declaring result count
        int cnt = 0;
        // Handle for k==0 case
        if (k == 0) {
            // Iterate through hashmap
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();
                // check any value greater than or equal 2 that means that element is present
                // more than one times in nums
                if (value >= 2) {
                    // Increment count to indicate that pair found
                    cnt++;
                }
            }
        }
        // Handle for other case
        else {
            // Iterate through hashmap
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();
                // Iterate through each value in nums
                for (int i = 0; i < nums.length; i++) {
                    // check if key==nums[i]-k
                    if (key == nums[i] - k) {
                        // Then check if the key is not -1, indicating this is first visit to this key
                        if (map.get(key) != -1) {
                            // In that case, increment count
                            cnt++;
                            // And modify the value to -1, which will indicate already visited
                            map.put(key, -1);
                        }

                    }

                }
            }
        }
        // Return count of pairs
        return cnt;
    }
}
