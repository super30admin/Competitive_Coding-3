// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes
//I had trouble figuring out the second condition where the k could be 0


// Your code here along with comments explaining your approach
class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        if(nums.length==0){
            return 0;
        }
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);//we store how many times we come across this number
        }
        for(int key:map.keySet()){
            if(k!=0 && map.containsKey(key+k)){//if difference exists add to counter
                count++;
            }
            if(k==0 && map.get(key)>1){//if no difference but value is there, increment counter
                count++;
            }
        }
        return count;
    }
}