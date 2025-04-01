import java.util.*;

//Time Complexity: O(n), where n is the length of the input array. We traverse the array once to build the frequency map and then again to count valid pairs.
//Space Complexity: O(n), where n is the number of unique elements in the input array. This is due to the space used by the HashMap to store the frequency of each element.

 /**
  * Finds the number of unique k-diff pairs in an array.
  * A k-diff pair is defined as an integer pair (i, j) such that |i - j| = k.
  * Uses a HashMap to count occurrences and find valid pairs efficiently.
  */

public class FindKDiffPairs {
    public int findPairs(int[] nums, int k) {
        int result = 0;
        HashMap <Integer,Integer> counter = new HashMap<>();
        for (int n: nums) {
            counter.put(n, counter.getOrDefault(n, 0)+1);
        }


        for (Map.Entry <Integer, Integer> entry: counter.entrySet()) {
            int x = entry.getKey();
            int val = entry.getValue();
            if (k > 0 && counter.containsKey(x + k)) {
                result++;
            } else if (k == 0 && val > 1) {
                result++;
            }
        }
        return result;
    }
}