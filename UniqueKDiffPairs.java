import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
//tc = o(n)
//sc = o(n)
class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num) + 1);
            }
            else{
                map.put(num,1);
            }
        }

        //do not iterate on array since it contains duplicates, iterate on the map. 
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            if(k > 0 && map.containsKey(key + k)){
                count ++;
            }
            else if(k == 0 && val > 1){ //for k = 0, the same numbers only can be a pair, so the freq for that number will be 2.  
                count++;
            }
        }
        return count;
    }
}