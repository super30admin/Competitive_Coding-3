// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int findPairs(int[] nums, int k) {
        int result = 0;
        
        // Map to store the unique number and its occurances
        
        // We could have done solved this using set if we were sure that k will not be 0
        // As k can be 0, we need to check if we have multiple occurances of same number
        // Above is the only reason of using Map
        
        Map<Integer, Integer> hashMap = new HashMap<>();
        
        for (int i=0;i<nums.length;i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry: hashMap.entrySet()) {
            
            // if  k = 0
            if (k == 0) {
                if (entry.getValue() > 1)
                    result++;
            } else if (hashMap.containsKey(entry.getKey() + k)) {
                result++;
            }
        }
    
        return result;
    }
}