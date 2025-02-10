import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution {
    public int findPairs(int[] nums, int k) {
         if (k < 0) return 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        // Populate the map with elements
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }

        // Use a HashSet to store unique pairs
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int temp1 = k + nums[i];
            int temp2 = nums[i] - k;

            if (map.containsKey(temp1) && map.get(temp1) != i) {
                List<Integer> pair = Arrays.asList(nums[i], temp1);
                pair.sort(null);
                set.add(pair); 
        
            }

            if (map.containsKey(temp2) && map.get(temp2) != i) {
                List<Integer> pair = Arrays.asList(nums[i], temp2);
                pair.sort(null);
                set.add(pair); 
            }
        }

        return set.size(); 
    }
}