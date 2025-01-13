import java.util.HashMap;
import java.util.Map;

/*
Time Complexity -> O(n)
Space Complexity -> O(n)
*/


class Solution1 {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mpp.containsKey(nums[i])) {
                mpp.put(nums[i], mpp.get(nums[i]) + 1);
            } else {
                mpp.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            if (k == 0) {
                if (entry.getValue() >= 2) {
                    count++;
                }
            } else {
                if (mpp.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }
        return count;
    }
}