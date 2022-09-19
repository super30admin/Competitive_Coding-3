import java.util.HashMap;

/**
Problem 1:  https://leetcode.com/problems/k-diff-pairs-in-an-array/

Time Complexity :   O (n)
Space Complexity :  O (n)
Did this code successfully run on Leetcode :    Yes (532. K-diff Pairs in an Array)
Any problem you faced while coding this :       No
 */

// Input: nums = [3,1,4,1,5], k = 2
// Output: 2

class FindPairs {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        
        for (Map.Entry <Integer, Integer> entry: map.entrySet()) {
            int x = entry.getKey();
            int val = entry.getValue();
            if (k > 0 && map.containsKey(x + k)) {
                count++;
            }
            else if (k == 0 && val > 1) {
                count++;
            }
        }
        return count;
    }
}