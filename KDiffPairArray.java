// Time Complexity  : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
/*
 * Sort the nums array
 * Initialized left and right as two ptrs [l = 0; r = 1]; initialized count = 0 to track number of pairs and sum = Min_value
 * While r < n and l < n-1 (n is length of array nums) took sum of nums[l] and nums[r] and also took diff of num[l] nums[r]
 * sum handles the duplicates
 * If diff is equal to K and sum is not equal to prev sum set sum = new Sum (sum of nums[l] and nums[r] )
 * Also  increment all counter and ptrs by 1
 * If diff is greater than K then increase l ptr to reduce the difference 
 * If diff is less then k then increase r ptr to reduce the gap
 * if l is equal to r then increment right ptr
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class KDiffPairArray {
    public int findPairs(int[] nums, int k) {
        if (nums.length == 1) {
            return 0;
        }

        int n = nums.length;

        // return helperHashSet(nums, k, n);

        // return helperBruteForce(nums, k, n);

        return helperTwoPtr(nums, k, n);
    }

    // private int helperHashSet(int[] nums, int k, int n) {
    //     Set<Integer> set = new HashSet<>();
    //     Arrays.sort(nums);

    //     for (int i = 0; i < n - 1; i++) {
    //         if (Arrays.binarySearch(nums, i + 1, n, nums[i] + k) > 0) {
    //             set.add(nums[i]);
    //         }
    //     }

    //     return set.size();
    // }

    // private int helperBruteForce(int[] nums, int k, int n) {
    //     Set<List<Integer>> result = new HashSet<>();

    //     for (int i = 0; i < n; i++) {
    //         for (int j = i + 1; j < n; j++) {
    //             if (Math.abs(nums[i] - nums[j]) == k) {
    //                 List<Integer> list = new ArrayList<>();
    //                 list.add(nums[i]);
    //                 list.add(nums[j]);
    //                 Collections.sort(list);
    //                 result.add(list);
    //             }
    //         }
    //     }
    //     return result.size();
    // }

    // Time Complexity: Max(O(nlogn), O(n))
    private int helperTwoPtr(int[] nums, int k, int n) {
        int l = 0;
        int r = 1;
        Arrays.sort(nums);
        int cnt = 0;
        int sum = Integer.MIN_VALUE;

        while (l < n - 1 && r < n) {
            int diff = nums[r] - nums[l];

            if (k == diff && nums[r] + nums[l] != sum) {
                sum = nums[r] + nums[l];
                cnt++;
                r++;
                l++;
            } else if (diff < k) {
                r++;
            } else {
                l++;
            }

            if (l == r) {
                r++;
            }
        }

        return cnt;
    }
}