//Time Complexity: O(N)
//Space Complexity: O(N)
//Leetcode: yes.

import java.util.HashMap;
import java.util.Map;

public class KDiffpairsLeetcode532 {
    public int findPairs(int[] nums, int k) {

        int result = 0;
        //get the frequency of each element.
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        //get each entry from the hashmap (value, frequency)
        for (Map.Entry <Integer, Integer> entry: map.entrySet()) {
            int x = entry.getKey();
            int val = entry.getValue();
            //if k != 0 then we just find the diff is present in hashmap
            if (k > 0 && map.containsKey(x + k)) {
                result++;
            } else if (k == 0 && val > 1) {
                //if k == 0 then we need to make sure we are not counting the same element with itself hence we need to check freqeucney it should be more than 1
                result++;
            }
        }
        return result;
    }
}
