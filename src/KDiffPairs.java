/*
Problem:
Given an array of integers nums and an integer k, return the number of UNIQUE k-diff pairs in the array.
A k-diff pair is (a, b) such that |a - b| = k.

Key points:
- Pairs are unique by VALUE, not by index.
- If k < 0, answer is 0 (because absolute difference can't be negative).

Approach (HashMap frequency):
1) Build a frequency map: freq[x] = how many times x appears.
2) Iterate over each unique value "key" in the map:
   - If k == 0:
       We need pairs like (key, key). This is only valid if freq[key] >= 2.
   - If k > 0:
       We only count (key, key + k) to avoid double counting.
       If (key + k) exists in the map, we count 1 unique pair.
3) Return count.
Why no double counting for k > 0?
- We only look in one direction: key -> key + k.
  So (a, b) is counted once, not again as (b, a).
Time Complexity:
 O(n) average time
Space Complexity:
- worst case O(n)
*/

import java.util.HashMap;
import java.util.Arrays;

public class KDiffPairs {

    public int findPairs(int[] nums, int k) {
        // Absolute difference cannot be negative
        if (k < 0) return 0;

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        int count = 0;

        for (int key : freq.keySet()) {
            if (k == 0) {
                // Need at least two occurrences to form (key, key)
                if (freq.get(key) > 1) count++;
            } else {
                // Count pair (key, key + k) only once
                int complement = key + k;
                if (freq.containsKey(complement)) count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        KDiffPairs solver = new KDiffPairs();

        int[][] testArrays = {
                {3, 1, 4, 1, 5},   // k=2 => 2
                {1, 2, 3, 4, 5},   // k=1 => 4
                {1, 3, 1, 5, 4},   // k=0 => 1
                {1, 1, 1, 1},      // k=0 => 1
                {1, 1, 2, 2},      // k=1 => 1
                {-1, -2, -3},      // k=1 => 2
                {1, 2, 3}          // k=-1 => 0
        };

        int[] ks = {2, 1, 0, 0, 1, 1, -1};
        int[] expected = {2, 4, 1, 1, 1, 2, 0};

        for (int i = 0; i < testArrays.length; i++) {
            int ans = solver.findPairs(testArrays[i], ks[i]);

            System.out.println("Test " + (i + 1));
            System.out.println("nums: " + Arrays.toString(testArrays[i]));
            System.out.println("k: " + ks[i]);
            System.out.println("output: " + ans);
            System.out.println("expected: " + expected[i]);
            System.out.println();
        }
    }
}
