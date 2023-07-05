import java.util.HashMap;
import java.util.Map;

public class Problem1 {

    public int findPairs(int[] nums, int k) {
        // Count the occurrences of each number in the array
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (k == 0) {
                // For k = 0, count the numbers that have more than 1 occurrence
                if (freq >= 2) {
                    count++;
                }
            } else {
                // For k > 0, check if num + k exists in the frequency map
                if (frequencyMap.containsKey(num + k)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, 4, 1, 5 };
        int k = 2;

        Problem1 solution = new Problem1();
        int uniquePairs = solution.findPairs(nums, k);

        System.out.println("Number of unique k-diff pairs: " + uniquePairs);
    }
}
