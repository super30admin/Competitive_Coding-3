// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No

//Problem: Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.
// Your code here along with comments explaining your approach
//Approach: create a frequency map of each element in array and see if each element can find a pair whose difference is K

class Solution {
    public int findPairs(int[] nums, int k) {
        
        
        HashMap <Integer,Integer> map=new HashMap<>();
        int count=0;
        
        for(int i: nums){
            
            map.put(i,map.getOrDefault(i,0)+1);
            
            if(k==0 && map.get(i)==2 ){
                
                count++;
            }
          
        }
        
        if(k==0){
            
            return count;
        }
        
        
        for(int x: map.keySet()){
            
            if(map.containsKey(x-k)){
                
                count++;
            }
        }
     return count++;   
    }
}