import java.util.HashSet;
import java.util.Set;

/**
 * Go through numbers, when a number is not seen before, add it to set (this way we will avoid duplicate pairs in future)
 * Check if number +k -k exist in set, if yes, update count. Handle k = 0 separately. Since for k = 0, we can have pair like 5, 5
 * We use another hashset to store duplicate seen. duplicate pair will be counted only once hence use another set
 *
 * Time Complexity O(N) N: size of nums
 * Space Complexity: O(N + N) worst case, all numbers will be stored in both sets
 */
public class KDiffPairs_LC532 {
    public int findPairs(int[] nums, int k) {
        int count = 0;                          // Output variable

        if (nums == null || nums.length == 0 || k < 0)      // Edge inputs
            return count;

        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : nums) {
            if (!set.contains(num)) {       // If number is not seen before
                set.add(num);               // Add it to set
                if (k == 0)                 // When k is 0, don't check for further conditions
                    continue;
                if (set.contains(num - k))    // Pair found
                    count += 1;
                if (set.contains(num + k))    // Pair found
                    count += 1;
            } else if (k == 0 && !duplicates.contains(num)) {       // When k is 0, i & j can be same numbers
                duplicates.add(num);                                // Add number to duplicates set when seen twice
                count += 1;                                         // Same number allowed only once, so use duplicate set
            }
        }
        return count;
    }
}
