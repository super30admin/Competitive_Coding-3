// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int findPairs(int[] nums, int k) {
        
        //hashmap approach TC SC O(n)
        HashMap<Integer, Integer> map= new HashMap<>();
        int count=0, sum;
        for(int i=0; i<nums.length; i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(k>0){
            for(int n : nums){
                int comp = n-k;
                if(map.containsKey(comp)){
                    map.remove(comp);
                    count++;
                }
            }
        }
        else{
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getValue() > 1) count++;
            }
        }return count;
    }
}
