// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes

import java.util.*;
public class kDifferentPairs {
        public int findPairs(int[] nums, int k) {
            int res = 0;
            HashMap<Integer, Integer> hm = new HashMap<>();
            for(int n : nums){
                hm.put(n, hm.getOrDefault(n,0)+1);
            }
            for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
                int key = entry.getKey();
                int val = entry.getValue();
                if(k>0 && hm.containsKey(key+k)){
                    res++;
                }
                else if(k==0 && val>1){
                    res++;
                }
            }
            return res;
        }
 }

