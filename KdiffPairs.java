package CompetitiveCoding3;

import java.util.HashMap;
import java.util.HashSet;

/*S30 Big N Problem #44 {Easy} - https://www.youtube.com/watch?v=dxvF47OKqIg
    You are given an integer array and a value k, you have to search for the unique k different pairs in this array .

    we define k different pairs as an integer pair (i,j), where i and j are the numbers in the given array only whose absolute difference is k.

    Keep in mind that the pairs (i,j) and (j,i) are conted as same pair and the length of the array will not exceed 10,000. also all the integer values belong to the range [-1e7,1e7]

    Example 1:
    Input:[1, 2, 3, 4, 5], k = 1

    Output: 4

    Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).

    Example 2:
    Input: [1, 3, 1, 5, 4, 8], k = 0

    Output: 1

    Explanation: There is one 0-diff pair in the array, (1, 1).
    Source Link: https://leetcode.com/problems/k-diff-pairs-in-an-array/
   -------------------------------------------------------------------------------------------------------
    Time complexity : o(n)
    space complexity: o(n)
    Did this code run successfully in leetcode : yes
    problems faces : no
    */

public class KdiffPairs {

    public int findPairs(int[] nums, int k) {

        if (nums == null || nums.length == 0)
            return 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            if (k == 0) {
                if (map.get(nums[i]) >= 2) {
                    count++;
                    map.put(nums[i], 1);
                }
            } else if (nums[i] > k) {
                if (map.containsKey(nums[i] - k) && !set.contains(nums[i] + nums[i] - k)) {
                    set.add(nums[i] + nums[i] - k);
                    count++;
                    System.out.println("loop1");
                }
            } else {
                if (map.containsKey(nums[i] + k) && !set.contains(nums[i] + k + nums[i])) {
                    set.add(nums[i] + k + nums[i]);
                    count++;
                    System.out.println("loop2");
                }
            }
        }
        return count;

    }

}
