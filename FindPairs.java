import java.util.*;

/**
 * @author Vishal Puri
 * // Time Complexity : O(n)
 * // Space Complexity : O(n)
 * // Did this code successfully run on Leetcode : Yes
 * // Any problem you faced while coding this :
 */

public class FindPairs {
    public int findPairs(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for (Integer n : nums)
            map.put(n, map.getOrDefault(n,0)+1);
        for (Integer key : map.keySet()){
            if(k==0 && map.get(key)>1)
                count++;
            else if(k>0 && map.containsKey(key+k))
                count++;
        }
        return count;
    }
}
