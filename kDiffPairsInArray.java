import java.util.HashMap;
import java.util.Map;

public class kDiffPairsInArray {
    public int findPairs(int[] nums, int k) {
        int n = nums.length, count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();

            if (k == 0 && val > 1) {
                count++;
            }
            if (k > 0 && map.containsKey(key + k)) {
                count++;
            }
        }
        return count;
    }
}

/**
 * TC: O(N)
 * SC: O(N)
 */