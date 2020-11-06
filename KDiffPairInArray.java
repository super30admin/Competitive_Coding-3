
// Time Complexity : O(n) where  n is size of the array
// Space Complexity : O(n) we use map to maintain key and count
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/*Approach
 * We will be using a hashing technique to our advantage to solve the problem in linear
 * time complexity. Maintain the Hash map with frequency of the count of each number.
 * This helps us to avoid the duplicate counting of the each pairs. We try to search two keys  whose
 * diff is k.
 * */


import java.util.HashMap;
import java.util.Map;

public class KDiffPairInArray {

    public int findPairs(int[] nums, int k) {
        //edge
        if(nums==null || nums.length==0 || k<0) return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int key : map.keySet()){
            int val = map.get(key);
            //Using strategy key+k in order to avoid duplicate counting of pairs
            if(k>0 && map.containsKey(key+k)){
                count++;
            }
            else if(k==0 && val>1){
                count++;
            }
        }
        return count;
    }
}