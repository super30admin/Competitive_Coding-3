class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int num=0;
        for(int i : nums){
            
            if(map.containsKey(i)){
                if(k==0 && map.get(i)==1){
                    num++;
                    map.put(i,map.get(i)+1);
                }
                continue;
            }

            
            num = num + map.getOrDefault(i-k,0);
            num = num + map.getOrDefault(i+k,0);
            map.put(i,1);
            
        }
        
        return num;
    }
}