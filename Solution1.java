class Solution {
    public int findPairs(int[] nums, int k) {
        int count=0;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
               map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }            
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key=entry.getKey();
            int val=entry.getValue();
            if(val>1 && k==0){
                count++;
                
            }
            else if (map.containsKey(key+k) && k>0) {
                count++;
            }
        }
        return count;
    }
}
