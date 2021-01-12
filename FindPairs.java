// Time Complexity : The time complexity is O(n) where n is the length of the array
// Space Complexity : The space complexity is O(n) where n is the length of the array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int findPairs(int[] nums, int k) {

        int count = 0;

        Map<Integer,Integer> map = new HashMap<>();

        // count the freq of each number
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int key:map.keySet()){

            // If diff is 0, duplicate numbers would give diff 0
            if(k==0 && map.get(key)>1){
                count++;
            }

            // If diff is greater than 0, see the presence of its compliment
            if(k!=0){
                if(map.containsKey(key+k)){
                    count++;
                }
            }
        }

        return count;

    }
}