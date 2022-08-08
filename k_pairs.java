// Time Complexity : O(n)
// Space Complexity : O(n)


import java.util.*;
class Solution {
    public int findPairs(int[] nums, int k) {
       HashMap<Integer,Integer> hm = new HashMap();
        HashSet<List<Integer>> res = new HashSet();
        for(int i:nums){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        for(int i: nums){
            if((i==i+k && hm.get(i)>1) || i!= i+k){
                if(hm.containsKey(i+k)){
                    List<Integer> pair = new ArrayList();
                    pair.add(i+k);
                    pair.add(i);
                    Collections.sort(pair);
                    res.add(pair);
                }
        }
        }
        return res.size();
    }
}
