// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

class Solution {
    public int findPairs(int[] nums, int k) {
        int counter = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int i: map.keySet()){
            if(k>0 && map.containsKey(i+k))
                counter++;
            else if(k==0 && map.get(i)>1)
                counter++;
        }
        return counter;
    }
}
