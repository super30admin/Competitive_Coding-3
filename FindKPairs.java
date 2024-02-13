import java.util.HashMap;
import java.util.Map;

public class FindKPairs {
	public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) return 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int x = entry.getKey();
            int val = entry.getValue();
            if (k > 0 && map.containsKey(x + k)) {
                count++;
            } else if (k == 0 && val > 1) {
                count++;
            }
        }
        
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
