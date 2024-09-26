import java.util.HashMap;
import java.util.Map;

//TC O(N)
//SC O(N) - for using HashMap
public class KDiff {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int x = entry.getKey();
            int val = entry.getValue();
            if (k > 0 && map.containsKey(x + k)) {
                cnt++;
            } else if (k == 0 && val > 1) {
                cnt++;
            }
        }
        return cnt;
    }
}
