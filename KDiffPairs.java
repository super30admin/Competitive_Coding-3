// Time Complexity : O(n) as we will traverse the given array linearly
// Space Complexity : O(n) as we are using auxiliary HashMap and HashSet
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :


import java.util.*;

class KDiffPairs {
    public int findPairs(int[] nums, int k) {

        if(nums.length < 2 || k <0){
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i< nums.length; i++){
            map.put(nums[i], i);
        }

        HashSet<List<Integer>> set = new HashSet<>();
        for(int i =0; i< nums.length; i++){
            Integer lowComplement = nums[i] -k;
            Integer highComplement = nums[i] + k;

            if(map.containsKey(lowComplement)){
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(lowComplement);
                Collections.sort(list);
                if(!set.contains(list) && map.get(lowComplement) != i){
                    set.add(list);
                }
            }

            if(map.containsKey(highComplement)){
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(highComplement);
                Collections.sort(list);
                if(!set.contains(list) && map.get(highComplement) != i){
                    set.add(list);
                }
            }
        }
        return set.size();
    }
}