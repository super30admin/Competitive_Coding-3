// Time Complexity : O(n) where n is length of input array
// Space Complexity : O(n) where n is length of input array
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Yes, i had trouble understanding what should be the key to store in hashmap. 
//                                          And i was getting issue in edge case where k = 0

import java.util.*;
public class KDiffPair {
    public static void main(String[] args) {
        
    }

    public static int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return 0;
        }   
           int count = 0;
           Map<Integer, Integer> map = new HashMap<>();
           for(int num: nums){
               map.put(num, map.getOrDefault(num, 0) + 1);
           }
           for(Map.Entry<Integer, Integer> entry: map.entrySet()){
               int key = entry.getKey();
               int val = entry.getValue();
               if(k > 0 && map.containsKey(key + k)){
                   count++;
               }else if(k == 0 && val > 1){
                   count++;
               }
           }
           return count;
       }
}
