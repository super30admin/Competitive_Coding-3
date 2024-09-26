import java.util.*;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class KDiffPairs {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = 0;
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            else{
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        
        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i]) > 0){
                if(map.containsKey(nums[i] + k)){
                    if(k == 0 && map.get(nums[i] + k) > 1){
                        result++;
                    }
                    else if(k > 0){
                        result++;
                    }
                    map.put(nums[i], 0);
                }
            }
        }
        return result;
    }
}