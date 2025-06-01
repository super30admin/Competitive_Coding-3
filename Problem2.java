//Problem: K-diff Pairs in an Array
// Did this code successfully run on Leetcode : Yes


//Approach: Brute force
// Time Complexity : O(n^2)
// Space Complexity : O(n)
class Solution {
    public int findPairs(int[] nums, int k) {
        if(k< 0)
            return 0;

        Set<String> uniquePairs = new HashSet<>();

        for(int i=0; i< nums.length ;i++){
            for(int j=i+1; j< nums.length; j++){
                if(Math.abs(nums[i]-nums[j]) == k){
                    int a = Math.min(nums[i], nums[j]);
                    int b = Math.max(nums[i], nums[j]);
                    uniquePairs.add(a + "," + b);
                }
            }
        }
        return uniquePairs.size();
    }
}


//Approach: Using hash map
// Time Complexity : O(n) -> single pass to build map and one pass over keys
// Space Complexity : O(n) -> for the hashmap

class Solution {
    public int findPairs(int[] nums, int k) {
        if (k<0)
            return 0;

        Map<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;

        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) +1);
        }

        for(int num: freqMap.keySet()){
            if(k ==0 ){
                if(freqMap.get(num)>=2){
                    count ++;
                }
            }
            else{
                if(freqMap.containsKey(num + k)){
                    count++;
                }
            }
        }

        return count;

    }
}