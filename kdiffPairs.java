// Time Complexity : O(n).
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Approach : Maintaining a HashMap with frequencies and iterating over the hashmap to find the complement helps in finding the k diff
// pairs as only unique values are allowed. Only special case is for k=0, for which we need to consider the keys that have more than 2 as their frequency.

class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int num : nums){ //store in hashmap
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            } else{
                map.put(num, 1);
            }
        }


        for(int num : map.keySet()){
            if(k>0){ //search for complement in hashmap
                if(map.containsKey(num - k)){
                    count++;
                }
            }
            else if(k==0){ //checking frequencies for k=0 and we need same key pairs
                if(map.get(num) >= 2){
                    count++;
                }
            }
        }
        return count;
    }
}