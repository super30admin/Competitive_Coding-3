/*
    LC - 532. K-diff Pairs in an Array
    TC - O(n)
    SC - O(n)
*/

class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> myMap = new HashMap<>();
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            myMap.put(nums[i], myMap.getOrDefault(nums[i], 0) + 1);
        }
        for(int temp : myMap.keySet()){
            if(k==0) {
                if(myMap.containsKey(temp + k) && myMap.get(temp + k) > 1) {
                    count++;
                }
            } else if(myMap.containsKey(temp + k)) {
                    count++;
            }
        }
        return count;
    }
}