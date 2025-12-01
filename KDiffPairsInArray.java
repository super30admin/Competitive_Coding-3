// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// 1: We first create a frequency map for each element from the input array
// 2: For each key in the set, we check to see whether the complement exists
// 3: For k=0, we check to see if duplicates exist in the array
class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                map.put(nums[i], count+1 );
            }
            else{
                map.put(nums[i], 1);
            }
        }

        int result = 0;
        // iterate through the map
        for(int key : map.keySet()){
            int complement = key + k;
            if(k > 0 && map.containsKey(complement)){
                result++;
            }
            else if(k==0 && map.get(key) >= 2 ){
                result++;
            }
        }
        return result;

    }
}