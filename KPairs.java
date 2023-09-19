import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findPairs(int[] nums, int k) {

        if(nums == null || nums.length == 0){
            return 0;
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i:nums){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }else{
                map.put(i, map.get(i) + 1);
            }
        }
        int count =0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(k==0){
                if(entry.getValue() >=2){
                    count++;
                }
            }else{
                int comp = entry.getKey() + k;
                if(map.containsKey(comp)){
                    count++;
                }
            }
        }
        return count;
    }
}