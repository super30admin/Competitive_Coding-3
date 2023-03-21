import java.util.Map;

// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * We count the frequency of each element and add it into the map. 
 * We iterate over the keyset and if the difference is equal to k and there is a key with i+k in the map, we increment count. 
 * If the difference is 0, we simply check if there are duplicates and increment count. 
 */
class Solution{
       public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        for(int num: nums)
            map.put(num, map.getOrDefault(num, 0)+1);
            int count = 0;
        for(int i:map.keySet()){
            if(k>0 &&map.containsKey(i+k) || k==0 && map.get(i) > 1)
                count++;
        }
        return count;
       }
    }