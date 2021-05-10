//Time Complexity : O(n)
//Space Complexity : O(n). 
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
class Solution {
    public int findPairs(int[] nums, int k) {
        
        int result = 0;
        
        HashMap<Integer,Integer> map1 = new HashMap<>();
        
        for(int i = 0; i < nums.length; i ++){
            
            if(!map1.containsKey(nums[i])){
                
                map1.put(nums[i],1);
            }
            
            else{
                
                map1.put(nums[i],map1.get(nums[i])+1);
            }
        }
        
      for (Map.Entry<Integer,Integer> entry : map1.entrySet()){
          
          if(k == 0){
              
              if(entry.getValue() >= 2){
                  
                  result ++;
              }
          }
          
          else {
              
              if(map1.containsKey(entry.getKey() + k)){
                  
                  result ++;
              }
          }
      }
        
        return result;
        
        
        
    }
}