
// Time Complexity : O(n) average
// Space Complexity :  O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

//Use a HashSet to store numbers already seen while traversing the array once.
//For each number, check whether num - k or num + k exists, and store each valid pair only once in used.
//Return used.size() as the number of unique k-difference pairs.

import java.util.*;

public class FindPairsClass {

    public int findPairs(int[] nums, int k) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> used = new HashSet<>();

        for (int num : nums) {

            if (k == 0) {
                if (set.contains(num)) {
                    used.add(num);
                }
            } else {
                if (set.contains(num - k)) {
                    used.add(num - k);
                }

                if (set.contains(num + k)) {
                    used.add(num);
                }
            }

            set.add(num);
        }

        return used.size();
    }
}