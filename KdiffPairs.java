import java.util.HashMap;

//https://leetcode.com/problems/k-diff-pairs-in-an-array/
/*
Time: O(n)
Space: O(n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
public class KdiffPairs {

    public int findPairs(int[] nums, int k) {

        if (nums == null || nums.length == 0 || k < 0)
            return -1;

        HashMap<Integer, Integer> map = new HashMap();
        int count = 0;

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for (int x : map.keySet()) {
            if (k > 0 && map.containsKey(x + k) || k == 0 && map.get(x) > 1)
                count++;
        }

        return count;
    }

}
