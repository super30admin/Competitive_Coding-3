import java.util.HashMap;
import java.util.Map;


//time : O(n)
//Space: O(n)
public class kdiff {

    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for(int i : nums) {
            if (map.containsKey(i)) {
                if (k == 0 && map.get(i) == 1) {
                    map.put(i, map.get(i) + 1);
                    res++;
                }
                continue;
            }
            System.out.println("nums[i] = "+i+"k = "+k+ "res = "+res);
            res += map.getOrDefault(i + k, 0);

            res += map.getOrDefault(i - k, 0);
            System.out.println("nums[i] = "+i+"k = "+k+ "res = "+res);
            map.put(i, 1);
        }
        return res;
    }
}
