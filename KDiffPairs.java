import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KDiffPairs {
    /**
     * Iterate over the array and Use hashing for constant time lookup
     * of desired target value in the hashset and keep on adding current element
     * to hashset as you go. If target found add the pair to hashset in sorted manner to
     * handle duplicate pair case and return the size of hashset holding the pairs
     *
     * Time: O(n) Space O(n)
     */
    public int findPairs(int[] arr, int k) {
        Set<List<Integer>> result = new HashSet<>();
        Set<Integer> valueSet = new HashSet<>();

        for (int num : arr) {
            int target1 = num + k;
            int target2 = num - k;
            if (valueSet.contains(target1)) {
                result.add(Arrays.asList(num, target1));
            }
            if (valueSet.contains(target2)) {
                result.add(Arrays.asList(target2, num));
            }
            valueSet.add(num);
        }
        return result.size();
    }
}
