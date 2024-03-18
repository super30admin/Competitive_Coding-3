// Time Complexity : O(n) 
// Space Complexity : Avg-O(m) Worst-O(n)

import java.util.HashMap;

public class KDiffPairs {
    public static void main(String[] args) {
        int[] n = new int[] {3,1,4,1,5};
        int k = 2;
        helper(n, k);
    }
    
    public static void helper(int[] nums, int k) {
       HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int r = 0;
        for (int x: map.keySet()) {
            if (k > 0 && map.containsKey(x+k) || k == 0 && map.get(x) > 1) r++;
        }
        System.out.println(r);
    }
}