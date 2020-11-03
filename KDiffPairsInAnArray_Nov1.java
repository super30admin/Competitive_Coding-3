package WeeklyInterviews;

import java.util.HashMap;
import java.util.Map;

class KDiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
        
    /* 
	Time Complexity: O(n).
	Because iterating through all elements of given array to populate hashmap which is O(n).
    Lookup in map for integer key takes constant time, hence O(1).

	Space Complexity: O(n)
	Because additional space of hashmap of size n in worst case if no two characters in given array are same, i.e. no duplicates.
	      
	Did this code successfully run on Leetcode : Yes

	Any problem you faced while coding this : No

    */
        
        // edge
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        Map<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        
        // Hashmap of all characters of given array maintained with frequency of each character.
        for (int i = 0; i < nums.length; i++) {
           if (hm.containsKey(nums[i])) {
               int temp = hm.get(nums[i]);
               hm.put(nums[i], temp+1);
           }  else {
               hm.put(nums[i], 1);
           }  
        }
        
       
        for (Map.Entry<Integer, Integer> e: hm.entrySet()) {
    // Special case: if k = 0, then we can find a unique pair only if a character's frequency is greater than 1
            if(k == 0) {
                if (e.getValue() >= 2) {
                    count++;
                }
            }
    // Hashmap traversed to check if key = anotherKey+k is present in hashmap.
        //    If yes, count increased by 1. 
            else if (hm.containsKey(e.getKey() + k)) {
                count++;
            }
        }
        
        return count;
    }
}





