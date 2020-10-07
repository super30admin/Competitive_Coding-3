// Time Complexity : O(N)
// Space Complexity : O(N) - As we used a additional data structure(HashMap)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    //Used a hashmap to keep track of count of each number

    //If k is 0 we can check for numbers whose count is greater than 1
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0 ||k < 0) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(k == 0){
                if(entry.getValue() >= 2){
                    count++;
                 }
            }
            else if(map.containsKey(entry.getKey() + k)) count++;
        }
        return count;
    }
}
// Your code here along with comments explaining your approach