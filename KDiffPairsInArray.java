import java.util.HashMap;

public class KDiffPairsInArray {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        int count = 0;
        for (int i : map.keySet()) {
            if (k > 0 && map.containsKey(i + k) || k == 0 && map.get(i) > 1)
                count++;
        }
        return count;
    }
}