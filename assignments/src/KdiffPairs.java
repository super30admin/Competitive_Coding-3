import java.util.HashMap;
import java.util.Map;

// Time: O(n), Space: O(n)

public class KdiffPairs {

    public int findPairs(int[] nums, int k) {

        if (nums == null || nums.length == 0) return 0;

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for (int num : map.keySet()){
            if (k != 0){
                if (map.containsKey(num-k)){
                    count++;
                }
            } else {
                if (map.get(num) > 1) count++;
            }

        }
        return count;
    }
}