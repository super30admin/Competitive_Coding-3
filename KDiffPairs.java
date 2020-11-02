package S30.CompetitiveCoding_3;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

import java.util.HashMap;
import java.util.Map;

public class KDiffPairs {

    public int findPairs(int[] nums, int k) {

        int count = 0;
        if(nums == null || nums.length == 0) return count;

        HashMap<Integer,Integer> freqMap = new HashMap<>();

        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){

            int key = entry.getKey();
            int val = entry.getValue();
            int complement = key + k;

            //edge case for k = 0
            if(k == 0 && val > 1){
                count++;
            } else if(k > 0 && freqMap.containsKey(complement)){
                count++;
            }
        }

        return count;

    }
}
