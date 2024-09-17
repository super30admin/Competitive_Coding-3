class Solution {
    public int findPairs(int[] nums, int k) {
    //TC:O(n) SC:O(n)
        HashMap<Integer, Integer> map1 =new HashMap<>();        
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(map1.containsKey(nums[i]))
                map1.put(nums[i],map1.get(nums[i])+1);
               else
               map1.put(nums[i],1);
        }
        for(int i: map1.keySet()){
            if(k!=0 &&map1.containsKey(i+k))count++;
               if(k==0 &&map1.get(i)>1)count++;
            
            }
        
        return count;
    }
}
