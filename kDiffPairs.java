// Time Complexity : O(nlogn + nlogn)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Yes I was getting wrong solution. my error was in second for loop

import java.util.*;

class Main {

    // function to find k diff pairs
    public static int findPairs(int[] nums, int k) {

        // sort the array so we can use binary search
        Arrays.sort(nums);
        int n = nums.length;
        // to store result
        int result = 0;
        // traverse through each element find its compatible element as per given
        // condition
        for (int i = 0; i < nums.length; i++) {
            // search compatible element using binary search
            // as per condition
            // nums[j] - nums[i] = k
            // so,nums[j] = nums[i] + k
            // if we found our element we increase our count
            if (binarySearch(nums, i + 1, n - 1, k + nums[i]))
                result++;
            // to avoid duplicate element we are skip element until we find unique element
            while (i != n - 1 && nums[i] == nums[i + 1])
                i++;
        }
        return result;
    }

    private static boolean binarySearch(int[] nums, int l, int r, int t) {

        // binary search
        while (l <= r) {

            // find mid element
            int mid = l + (r - l) / 2;
            // if found our desired element we return true;
            if (nums[mid] == t) {
                return true;
            } else if (nums[mid] > t) {

                // discard second half
                r = mid - 1;
            } else {
                // discard first half
                l = mid + 1;
            }
        }

        // we have not found our element we return false
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 3, 1, 4, 1, 5 };
        int k = 2;
        System.out.println(findPairs(nums, k));
    }
}