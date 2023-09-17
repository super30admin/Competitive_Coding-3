// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : finding methods in java


// Your code here along with comments explaining your approach
//using hashmap for storing keys as numers from list and values as frequesncy. then based on if k==0 or k>0 
// 2 cases were created. if k==0 then count increated by 1 for every frequency>=2. 
//For k>0  count were increased if key+k values is present in hashmap.
class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k < 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i: nums) {
            map.put(i,map.getOrDefault(i,0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(k == 0) {
                if(entry.getValue() >= 2) {
                    count++;
                } 

            } else {
                if(map.containsKey(entry.getKey() + k)) {
                    count ++;
                }
            }
        }
        return count;
    }
}