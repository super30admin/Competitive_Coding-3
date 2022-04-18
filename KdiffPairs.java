// Time Complexity : o(n)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

//used hashmap approach where we store elemetns and compare in same loop , look at edge acse when k = 0

// Your code here along with comments explaining your approach
class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int n: map.keySet()) {
            if(k == 0) {
                if(map.get(n) >= 2) {
                    result++;
                }
            }
            else {
                if(map.containsKey(n + k)) {
                    result++;
                }
            }
        }
        return result;
    }
}