//Problem : 532 - K-diff Pairs in an Array
//Successfully solved on Leetcode
//TC : O(n) SC : O(n)

class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int count = 0;
        //write frequencies of each element
        for(int a : nums){
            map.put(a , map.getOrDefault(a ,0)+1);
        }
        for(int b : map.keySet()){
            if(k == 0){
                if(map.get(b) > 1){
                    count++;
                }

            }
            else{
                if(map.containsKey(b+k)){
                    count++;
                }
            }
        }
        return count;
        
    }
}