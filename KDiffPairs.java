// Time Complexity : O(n)  n is number of elements in array.
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(int i = 0; i<nums.length; i++) {
            if(k == 0){
                if(map.get(nums[i]) > 1){
                    map.put(nums[i], map.get(nums[i]) * -1);
                    count++;
                }
            }
            else{
                int sum = nums[i]+k;

                if(map.containsKey(sum)){
                    if(map.get(nums[i]) > 1 ){
                        count++;
                        map.put(nums[i], map.get(nums[i]) * -1);
                    }else if (map.get(nums[i])<0){
                        continue;
                    }else{
                        count++;
                    }
                }
            }

        }
        return count;
    }
}