// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public int findPairs(int[] nums, int k) {
        
        if(k < 0)
            return 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            Integer complementDiff = nums[i] - k;
            Integer complementSum = nums[i] + k;
            if(map.containsKey(complementDiff)) {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(complementDiff);
                Collections.sort(temp);
                if(!set.contains(temp) && map.get(complementDiff) != i) {
                    set.add(temp);
                }
            }
            if(map.containsKey(complementSum)) {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(complementSum);
                Collections.sort(temp);
                if(!set.contains(temp) && map.get(complementSum) != i) {
                    set.add(temp);
                }
            }
        }
        return set.size();
    }
}