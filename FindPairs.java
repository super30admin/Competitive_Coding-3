// Overall Time Complexity : O(n) . The time taken to iterate over the array and over the hashmap ie O(n+n) ie O(2n).
// Overall Space Complexity : O(n) . The space complexity is the time take to store elements in the hashmap.
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No issues faced during implementation



//Count the frequency of each number in the array using a HashMap.
//For each unique number in the map, check if there exists a pair with difference k (i.e., num + k) or if k == 0 and the number appears more than once.
//Return the total count of such valid pairs.

import java.util.HashMap;
import java.util.Map;


public class FindPairs {
       public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int count = 0;
        for(int i=0 ; i<nums.length;i++){
            hmap.put(nums[i],hmap.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: hmap.entrySet()){
            int x = entry.getKey();
            int val = entry.getValue();

            if(k>0 && hmap.containsKey(x+k)){
                count++;
            }
            if(k == 0 && val>1){
                count++;
            }
        }
        return count;

        
    }
}
