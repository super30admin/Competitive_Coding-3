//Array spiral
// Time Complexity : O(N)
//Space Complexity : O(N) 
//Did this code successfully run on Leetcode : Yes

class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0 ) return 0;
        if(k<0 ) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        map.put(nums[0],1);
        for(int i =1;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(k==0 && map.get(nums[i]) == 1){
                    count++;
                }
                map.put(nums[i],2);
                continue;
            }
            if(map.containsKey(nums[i]-k)){
                count++;
            }
            if(map.containsKey(nums[i]+k)){
                count++;
            }
            map.put(nums[i],1);
        }
        return count;
}
}