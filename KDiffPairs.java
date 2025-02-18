// Time Complexity : O(n) where n is the number of elements in the array
// Space Complexity : O(n) where n is the number of elements in the array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// I have used a hashmap to store the frequency of each element in the array.
// Then I iterate over the hashmap and check if the key+k exists in the hashmap.
// If k > 0 and key+k exists, then I increment the count.

import java.util.HashMap;
import java.util.Map;

class KDiffPairs {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        int count = 0;

        for(Map.Entry<Integer, Integer> entrySet: map.entrySet()){
            int val = entrySet.getValue();
            int key = entrySet.getKey();

            if(k > 0 && map.containsKey(key+k)){
                count++;
            }else if(k == 0 && val > 1){
                count++;
            }
        }
        return count;
    }
}