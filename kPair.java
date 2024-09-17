// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums.length==0 || nums==null)
            return 0;
        
        int count=0;
        Map<Integer, Integer> hMap = new HashMap<>();
        
        //updating values in hashmap
        for(int i: nums) {
            hMap.put(i, hMap.getOrDefault(i,0)+1);
        }
        
        //update the count
        for(int i: hMap.keySet()) {
            if(k==0) {
                if(hMap.get(i)>=2)
                    count++;
            }
            else {
                if(hMap.containsKey(i+k))
                    count++;
            }
        }
        return count;
    }
}