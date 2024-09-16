// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public class KdiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
        if(nums ==null || nums.length <2) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        int counter = 0 ;
        for(int num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) +1);
            } else {
                map.put(num, 1);
            }
        }

        for(int key : map.keySet()) {
            if(k != 0 &&map.containsKey(key+k)) {
                counter+=1;
            }
            if(k == 0 &&  map.get(key) >1) {
                counter+=1;
            }
        }
        return counter;
    }
}