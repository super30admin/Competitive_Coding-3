// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes


// Your code here along with comments explaining your approach
//Hash map is created with frequency map, iterated over the hashmap to increment the counter based on the diff found.

class Solution {
    public int findPairs(int[] nums, int k) {
        int counter =0 ;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            if(k>0 && map.containsKey(k+entry.getKey())){
                counter++;
            }else if(k==0 && entry.getValue() > 1){
                counter++;
            }
        }
        return counter;
    }
}