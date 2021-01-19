// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : some issues with edge cases

public class KDiffPairs {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        int hold = Integer.MIN_VALUE;
        int hold1 = Integer.MIN_VALUE;
        if(nums == null || nums.length == 0) return 0;
        HashMap<Integer,Integer> prev = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(prev.containsKey(nums[i])){
                int temp = prev.get(nums[i]) + 1;
                prev.put(nums[i],temp);
            }
            else{
                prev.put(nums[i],1);
            }
        }
        for(int i = 0; i < nums.length; i++){
            if( k > 0 && prev.containsKey(nums[i]-k)){
                if(prev.get(nums[i]-k) == 1){
                    count += 1;
                    prev.put(nums[i] - k, 0);
                }
                else if(prev.get(nums[i]-k) != 0 && prev.get(nums[i]-k) != 1 ){
                    count += 1;
                    prev.put(nums[i] - k, 0);
                }
                else{
                    continue;
                }
            }
            else if(k == 0 && prev.get(nums[i] - k) >= 2){
                if(hold == nums[i]){
                    continue;
                }
                else{
                    hold = nums[i];
                    count += 1;
                }
            }
        }
        return count;
    }
}