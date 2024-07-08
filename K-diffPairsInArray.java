// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
public class K-diffPairsInArray {

class Solution {
    public int findPairs(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i = 0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(int key: map.keySet()) {
            if(k==0) {
                if(map.get(key)>1)
                    count++;
            }else {
                if(map.containsKey(key - k))
                    count++;
            }
        }

        return count;
    }
}

}