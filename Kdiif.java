//o(n) time and space
//passed all leetcode cases
//used compliment technique and a map to solve

class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0)return 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],2);
            }else{
                map.put(nums[i],1);
            }
        }
        int count = 0;
        if(k==0){
            for(int i = 0; i<nums.length; i++){
                if(map.containsKey(nums[i]) && map.get(nums[i]) > 1){
                    count++;
                    map.replace(nums[i],0);
                }
            }
            return count;
        }
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i] + k) && map.get(nums[i] + k) > 0 && map.get(nums[i]) > 0){
                count++;
            }
            if(map.containsKey(nums[i] - k) && map.get(nums[i] - k) > 0 && map.get(nums[i]) > 0){
                count++;
            }
            map.replace(nums[i],0);
        }
        return count;
    }
}
