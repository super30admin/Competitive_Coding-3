// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Used HashMap to mark the elements with values as -1 or 1 to mark its lesser pair or greater pair is found.
//Whenever the map contains it's pair with given diff, increment counter and mark its pair with -1 or 1.

import java.util.HashMap;
import java.util.Map;

public class KDiffPairs {
    public int findPairs(int[] nums, int k) {
        int count=0;
//[3,1,4,1,5] k =2
        if(nums == null || nums.length==0) return 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            //chk if no. is already there in map
            if(!map.containsKey(nums[i])){ //first encounter of ith element
                if(map.containsKey((nums[i]) - k)){  //its pair is already there
                    map.put(nums[i], -1);
                    if(map.get(nums[i]-k) != 1 ) {
                        map.put(nums[i]-k, 1);
                        count++;
                    }
                } if(map.containsKey((nums[i]) + k)){  //its pair is already there
                    map.put(nums[i], 1);
                    if(map.get(nums[i]+k) != -1 ) {
                        map.put(nums[i]+k, -1);
                        count++;
                    }
                }else {
                    map.put(nums[i], 0);
                }

            } else {
                if(k ==0 && map.get(nums[i]) == 0){
                    map.put(nums[i], 1);
                    count++;
                }
            }

        }
        return count;
    }
}
