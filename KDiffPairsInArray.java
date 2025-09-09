//Time Complexity: O(n)
//Space Complexity: O(n)
// Did this code successfully run on Leetcode :Yes
//Approach: In the case k > 0, we can maintain a unique set of integers from the nums, iterate over those unique nums to see if num + k is present in the Set, if yes, add 1 to the result
// if k == 0, we can maintain a map of num and frequency to see if that numbers frequency is > 1 then k = 0 can be achieved
// We could've also done the k > 0 using a hashmap, but we don't need a hashmap for k > 0 usecase because we only need the unique numbers to form the pairs

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class KDiffPairsInArray {

    public int findPairs(int[] nums, int k) {
        int result = 0;

        if (k > 0) {
            final Set<Integer> unique = new HashSet<>();
            for (int x : nums) unique.add(x);

            for (int x : unique) if (unique.contains(x + k)) result++;
        } else {
            final Map<Integer, Integer> frequency = new HashMap<>();
            for (int num: nums) frequency.put(num, frequency.getOrDefault(num, 0) + 1);

            for (int num: frequency.keySet()) {
                if (frequency.containsKey(num + k) && frequency.get(num + k) > 1) result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        final KDiffPairsInArray kDiffPairsInArray = new KDiffPairsInArray();
        System.out.println(kDiffPairsInArray.findPairs(new int[] {1,3,1,5,4}, 0)); //return 1 [1,1]
        System.out.println(kDiffPairsInArray.findPairs(new int[] {1,2,3,4,5}, 1)); //return 4 [1,2], [2,3], [3,4], [4,5]
        System.out.println(kDiffPairsInArray.findPairs(new int[] {3,1,4,1,5}, 2)); //return 2 [1,3], [3,5]
    }
}
