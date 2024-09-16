
class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0){
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0; i<nums.length; i++){
            
            if(map.containsKey(nums[i])){
                int number = map.get(nums[i]);
                number++;
                map.put(nums[i],number);
            }
            else{
                map.put(nums[i],1);
            }
            
            
        }
        for(int i=0; i<nums.length; i++){
            if(k!=0){
                if(map.containsKey(nums[i]-k) && map.get(nums[i])>0){
                    count ++;
                    map.put(nums[i],0);
                }
            }
            else{
                if(map.containsKey(nums[i])) {
                    if(map.get(nums[i])>1){
                        count++;
                        map.put(nums[i],0);
                    }
                }
            }
        }
        return count;
        
    }
}