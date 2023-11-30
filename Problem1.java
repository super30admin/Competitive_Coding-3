// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Problem1 {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int target1 = nums[i] + k;
            int target2 = nums[i] - k;

            if (map.containsKey(target1) && i != map.get(target1)) {
                if (nums[i] > target1) {
                    set.add(Arrays.asList(target1, nums[i]));
                } else {
                    set.add(Arrays.asList(nums[i], target1));
                }
            }

            if (map.containsKey(target2) && i != map.get(target2)) {
                if (nums[i] > target2) {
                    set.add(Arrays.asList(target2, nums[i]));
                } else {
                    set.add(Arrays.asList(nums[i], target2));
                }
            }
        }

        return set.size();
    }

    public static void main(String[] args) {
        Problem1 obj = new Problem1();

        // Example usage
        int[] nums = {3, 1, 4, 1, 5};
        int k = 2;

        int result = obj.findPairs(nums, k);
        System.out.println("Number of unique pairs with a difference of " + k + ": " + result);
    }
}
