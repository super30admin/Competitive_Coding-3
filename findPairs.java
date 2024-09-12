// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
import java.util.HashMap;

class Solution {
    public int findPairs(int[] nums, int k) {
        //base case to check if the array is empty
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        //we keep a counter because we only return number of pairs, not returning list of pairs
        int count = 0;
        
        //for each element, we keep how many times it appears in the array
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //go through each element in the map
        for (int num: map.keySet()) {
            //calculate the compliment
            int comp = num + k;
            
            //base case to pass the test case where the target is 0 so we find pairs of same values
            if(k == 0 && map.get(num) > 1){
                count++;
            }
            else if (k > 0 && map.containsKey(comp) ) {
                count++;
            }
        }
        return count;
    }
}