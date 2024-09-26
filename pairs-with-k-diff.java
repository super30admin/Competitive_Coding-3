class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                // the array element and  increament the frequence by 1
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                // keep the frequene of current element as 1
                map.put(nums[i], 1);
            }
        }
        int count = 0;
        //create key set for iterating through key values
        Set<Integer> set = map.keySet();
        for(int cur: set){
            //check: if map contains cur+k, then increment count
            if(k > 0 &&map.containsKey(cur + k)){
                count++;
            }
            // check for situation when key =0. here we check if array has repeated numbers,        i.e.value>1
            if(k==0 && map.get(cur) > 1){
                count++;
            }
        }
        return count;
    }
}
