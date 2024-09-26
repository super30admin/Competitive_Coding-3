//Time complexity:O(n)
//Space complexity:O(n)

class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0){
            return 0;
        }
        int result=0;
        Map<Integer,Integer> map=new HashMap();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : map.keySet()){
            int complement = i + k;
            if(k==0){
                if(map.get(i)>=2){
                    result++;
                }
            }
            else{
                if(map.containsKey(complement)){
                    result++;
                }
            }
        }
        return result;
    }
}