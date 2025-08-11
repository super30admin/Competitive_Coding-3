import java.util.*;

public class FindPairs {
    /*
    Approach:
    - Sort the array to use two pointers (i and j).
    - Use two pointers to find pairs where the difference is exactly k.
    - If difference is less than k, move right pointer forward.
    - If difference is greater than k, move left pointer forward.
    - If difference equals k, increment count and move both pointers forward, skipping duplicates to ensure unique pairs.
    - Handle case when k < 0 by returning 0 immediately.

    Time Complexity:
        O(n log n) due to sorting + O(n) for two-pointer traversal → overall O(n log n).
    Space Complexity:
        O(1) additional space besides input array.
    Did this code successfully run on Leetcode:
        Yes.
    Any problem you faced while coding this:
        Handling duplicates properly was tricky to ensure unique pairs.

*/

    public int findPairs(int[] nums, int k) {
        if (k < 0) {
            return 0;  // no pairs possible for negative difference
        }
        Arrays.sort(nums);
        int i = 0, j = 1;
        int count = 0;

        while (i < nums.length && j < nums.length) {
            if (i == j || nums[j] - nums[i] < k) {
                j++;
            } else if (nums[j] - nums[i] > k) {
                i++;
            } else {  // difference == k
                count++;
                i++;
                j++;
                // skip duplicates for i
                while (i < nums.length && nums[i] == nums[i - 1]) {
                    i++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        FindPairs sol = new FindPairs();

        int[] nums1 = {3, 1, 4, 1, 5};
        int k1 = 2;
        System.out.println(sol.findPairs(nums1, k1)); // Expected: 2 (pairs: (1,3), (3,5))

        int[] nums2 = {1, 2, 3, 4, 5};
        int k2 = 1;
        System.out.println(sol.findPairs(nums2, k2)); // Expected: 4

        int[] nums3 = {1, 3, 1, 5, 4};
        int k3 = 0;
        System.out.println(sol.findPairs(nums3, k3)); // Expected: 1 (pair: (1,1))

        int[] nums4 = {1, 1, 1, 1, 1};
        int k4 = 0;
        System.out.println(sol.findPairs(nums4, k4)); // Expected: 1 (pair: (1,1))

        int[] nums5 = {1, 5, 3, 4, 2};
        int k5 = -1;
        System.out.println(sol.findPairs(nums5, k5)); // Expected: 0 (negative k)
    }

}
