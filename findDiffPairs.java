// Time Complexity: O(n log n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode: No got TLE 
// Any problem you faced while coding this: No

import java.util.Arrays;

public class findDiffPairs {
    private static int getDiffPairs(int[] arr, int k) {
        int n = arr.length;
        // Null case
        if (arr == null || n == 0)
            return -1;
        Arrays.sort(arr);
        int count = 0;

        // Taking two pointers
        int slow = 0;
        int fast = 1;

        while (slow < n && fast < n) {
            // if diff is lesser than moving fast
            if (Math.abs(arr[slow] - arr[fast]) < k) {
                fast++;
            } else {
                if (Math.abs(arr[fast] - arr[slow]) == k) {
                    // checking for duplicate case
                    if (slow == 0 || arr[slow] != arr[slow - 1]) {
                        count++;
                    }
                    slow++;

                    if (slow == fast)
                        fast++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int k = 1;
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(getDiffPairs(arr, k));
    }
}
