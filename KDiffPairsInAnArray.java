package competitiveCoding3;

import java.util.HashMap;
import java.util.Map;

public class KDiffPairsInAnArray {
	//Time Complexity : O(n), where n is the length of nums
	//Space Complexity : O(n), for storing integers from nums and their count in a HashMap
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : Counting and returning 'count' for k = 0
	public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for(int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if(k == 0 && map.get(i) == 2)
                count++;
        }
        
        if(k == 0)
            return count;
        
        for(int i: map.keySet()) {
            if(map.containsKey(i - k))
                count++;
        }
        
        return count;
    }
}
