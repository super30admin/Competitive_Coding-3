class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap <Integer, Integer> hm = new HashMap<>();
        
        for(int i : nums){
            hm.put(i , hm.getOrDefault(i , 0) + 1);
        }
        int count = 0;
        for(int i : hm.keySet()){
            if((k==0 && hm.get(i) > 1) || (k> 0 && hm.containsKey(i+k) ) ) {
                count++;
        
        if(k==0)
            hm.put(i , hm.get(i) - 2);
            
        else{
            hm.put( i , hm.get(i) - 1);
         
            hm.put(i + k , hm.get(i + k) - 1);
            
        }
            }
        }
        return count;
    }
}







