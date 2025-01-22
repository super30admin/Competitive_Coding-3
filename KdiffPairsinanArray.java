import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Time Complexity: O(n ^ 2) + O(n log n) = O(n ^2). Nested loop has been used. 
// Can be Time optimized by trading off nested loop with extra data structure. I will push the optimised version soon.
// Space Complexity: O(n) as Map has been used

// Sorting is done prior to check for the unique diff elements. Pushing in the map is done if the element is not present.
public class KdiffPairsinanArray {

    public static void main(String[] args) {
        System.out.println(findPairs(new int[] { 3, 1, 4, 1, 5 }, 2)); // 2
        System.out.println(findPairs(new int[] { 1, 2, 3, 4, 5 }, 1)); // 4
    }

    public static int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return 0;
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            for (int i = j + 1; i < nums.length; i++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    if (!map.containsKey(nums[j]) || map.get(nums[j]) != nums[i]) {
                        map.put(nums[j], nums[i]);
                    }
                }
            }
        }
        return map.size();
    }

}
