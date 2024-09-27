//Time Complexity : O(n)
//Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Your code here along with comments explaining your approach
class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums==null||nums.length==0){
            return 0;
        }
        Map<Integer,Integer> map = new HashMap<>();
        int res=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(k==0){
            for(int num : map.values()){
                if(num > 1){
                    res++;
                }
            }
        }
        else{
        for(int i=0;i<nums.length;i++){
            int sum = nums[i]+k;
            if(map.containsKey(sum)){
                res++;
                map.remove(sum);
            }
        }
    }
        return res;
    }
}