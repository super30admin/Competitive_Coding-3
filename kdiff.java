// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes 
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
// use hashmap to lookup if n+k exists in map, if yes add to result
// for the case of k=0 keep count of vals, add if count>1  

public class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums==null || nums.length==0)
            return 0;
        
        int result = 0;

        HashMap <Integer,Integer> counter = new HashMap<>();
        for (int n: nums) {
            counter.put(n, counter.getOrDefault(n, 0)+1);
        }

        for (Map.Entry <Integer, Integer> entry: counter.entrySet()) {
            int x = entry.getKey();
            int val = entry.getValue();
            if (k > 0 && counter.containsKey(x + k)) {
                result++;
            } else if (k == 0 && val > 1) {
                result++;
            }
        }
        return result;
    }
}