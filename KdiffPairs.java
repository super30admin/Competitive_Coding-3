// Time Complexity :O(N) for sorting I'm confused because sorting only 2 elements according
// to my understanding it must be constant
// Space Complexity :O(N) for map
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
import java.util.*;

public class KdiffPairs {
    public int findPairs(int[] nums, int k) {
    if(nums.length == 0 || k < 0){
        return 0;
    }

    Map<Integer, Integer> map = new HashMap<>();
    Set<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
        map.put(nums[i],i);
    } // Populating HashMap

        for(int i = 0; i < nums.length; i++){

        int complement1 = nums[i] - k;
         int complement2 = nums[i] + k;

        if(map.containsKey(complement1)){

            List<Integer> list = new ArrayList<>();
            list.add(nums[i]);
            list.add(complement1);
            Collections.sort(list);

            if(!set.contains(list)  && map.get(complement1) != i){
                set.add(list);
            }

        }

             if(map.containsKey(complement2)){
                 List<Integer> list = new ArrayList<>();
                 list.add(nums[i]);
                 list.add(complement2);
                 Collections.sort(list);

                 if(!set.contains(list)  && map.get(complement2) != i){
                     set.add(list);
                 }
             }
    }

        return set.size();
}
}
