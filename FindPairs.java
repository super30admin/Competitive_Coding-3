// Time Complexity : O(N)
// Space Complexity : O(N)

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindPairs {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                if (entry.getValue() >= 2)
                    count++;
            } else {
                if (map.containsKey(entry.getKey() + k))
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        FindPairs pairs = new FindPairs();

        List<int[]> input = new ArrayList<>();
        Collections.addAll(input, new int[] { 3, 1, 4, 1, 5 }, new int[] { 1, 2, 3, 4, 5 }, new int[] { 1, 3, 1, 5, 4 },
                new int[] { 1, 2, 4, 4, 3, 3, 0, 9, 2, 3 }, new int[] { -1, -2, -3 });

        List<Integer> kVals = new ArrayList<>();
        Collections.addAll(kVals, 2, 1, 0, 3, 1);

        for (int i = 0; i < input.size(); i++) {
            System.out.println(pairs.findPairs(input.get(i), kVals.get(i)));
        }
    }
}
