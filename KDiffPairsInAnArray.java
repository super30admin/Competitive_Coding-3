// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes

import java.util.HashMap;

class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> frequency = new HashMap<>();
        int ans=0;
        for(int n:nums){
            frequency.put(n,frequency.getOrDefault(n,0)+1);
        }
        if(k==0){
            for(int i : frequency.values()){
                if(i>=2)ans++;
            }
        }
        else{
            for(int j: frequency.keySet()){
                if(frequency.containsKey(j+k))ans++;
            }
        }
        return ans;
    }
}