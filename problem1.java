// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach



class problem1 {
    public int findPairs(int[] nums, int k) {
        
        
        int count=0;
        
        if(nums==null || nums.length==0)
            return count;
        
        HashMap<Integer, Integer> sMap=new HashMap<>();
        
        for(int i:nums)
            sMap.put(i,sMap.getOrDefault(i,0)+1);
        
        
        for(int x:sMap.keySet()){
            
            if((sMap.containsKey(x+k) && k>0) || (k==0 && sMap.get(x)>1)) {
                count++;
            }            
            
        }
        return count;
        
    }
}