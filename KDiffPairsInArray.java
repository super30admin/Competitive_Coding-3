class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0) return 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],i);
        }
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            int complement1 = nums[i] - k;
            int complement2 = nums[i] + k;
            
            if(map.containsKey(complement1) && map.get(complement1) != i){
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(nums[i]);
                temp.add(complement1);
                Collections.sort(temp);
                if(!set.contains(temp)) {
                    set.add(temp);
                }
            }
            if(map.containsKey(complement2) && map.get(complement2) != i){
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(nums[i]);
                temp.add(complement2);
                Collections.sort(temp);
                if(!set.contains(temp)){
                    set.add(temp);
                } 
            }
        }
        return set.size();
    }
}
