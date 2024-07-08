/*
TC --> O(n)
SC --> O(n) for the HashMap
 */
import java.util.*;

class Solution {

    public int findPairs(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }

        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }//for
        int c = 0;
        for (int num : mp.keySet()) {
            if (k == 0) {
                if (mp.containsKey(num + k) && mp.get(num + k) > 1) {
                    c++;
                }//if
            }//if
            else {
                if (mp.containsKey(num + k)) {
                    c++;
                }//if
            }

        }//for
        return c;
    }//method
}//class
