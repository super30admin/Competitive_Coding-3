import java.util.*;

// O(n^2) time, O(n) space
// class Solution {
//     public int findPairs(int[] nums, int k) {
//         Set<List<Integer>> set = new HashSet<>();
//         int count = 0;
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i+1; j < nums.length; j++) {
//                 if (Math.abs(nums[i] - nums[j]) == k) {
//                     int a = Math.min(nums[i], nums[j]);
//                     int b = Math.max(nums[i], nums[j]);

//                     if (set.add(Arrays.asList(a, b))) {
//                         count++;
//                     }
//                 }
//             }
//         }
//         return count;
//     }
// }

// O(n) time, O(n) space
class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int num = e.getKey();
            int freq = e.getValue();

            if (k == 0) {
                if (freq >= 2) {
                    count++;
                }
            }

            if (k > 0) {
                if (map.containsKey(num + k)) {
                    count++;
                }
            }
        }
        return count;
    }
}