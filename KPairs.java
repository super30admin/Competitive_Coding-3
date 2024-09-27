/*The time complexity of this implementation is O(n)*/
import java.util.HashMap;
import java.util.Map;

class KPairs {
    public int findPairs(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            if (map.containsKey(num - k)) {
                count += map.get(num - k);
            }
            if (k != 0 && map.containsKey(num + k)) {
                count += map.get(num + k);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 1, 5};
        int k = 2;
        KPairs solution = new KPairs();
        int count = solution.findPairs(nums, k);
        System.out.println(count); // output: 2
    }

}
