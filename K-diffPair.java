//Time COmplexity : O(N)
// SPace : O(N)
class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int count=0;
        for(Map.Entry<Integer,Integer> obj : map.entrySet()){
            if(k==0){
                if(obj.getValue()>1){
                    count ++;
                }
            }else{
                if(map.containsKey(obj.getKey()-k)){
                    count++;
                }
            }
        }
        return count;
    }
}