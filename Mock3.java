//TC:O(n)
//SC:O()
class Solution {
    public int findPairs(int[] nums, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int cntr=0;
        
        for(int eachNum : nums){
                map.put(eachNum,map.getOrDefault(eachNum,0) +1);
        }
        for(Map.Entry <Integer, Integer> eachEle: map.entrySet()){
            if(map.containsKey(eachEle.getKey()-k) && k>0 ){
                cntr++;
            }
            if(k==0 &&eachEle.getValue()>1){
                cntr++;
            }
        }
    return cntr;    
    }
    
}