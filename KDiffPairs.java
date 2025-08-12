// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Approach
// 1) Store frequencies of all numbers in a HashMap.
// 2) If k == 0, count numbers with frequency >= 2.
// 3) If k > 0, count numbers whose (num - k) also exists in the map.


import java.util.HashMap;

public class KDiffPairs {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int num : map.keySet()) {
            int frq = map.get(num);
            if(k == 0) {
                if(frq >= 2) {
                    count++;
                } 
            } else {
                if(map.containsKey(num - k)) {
                    count++;
                }
            }
        }
        return count;
    }
}
