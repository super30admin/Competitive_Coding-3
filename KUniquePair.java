//Time Complexity: O(N)
//Space Complexity:O(N)
lass Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length ==0 ){
            return 0;
        }
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i =0;i<nums.length;i++){
            if(k!=0)
             {
                if(!map.containsKey(nums[i])) {
                    if(map.containsKey(nums[i]-k))  {
                        count++; 
                    }
                    if(map.containsKey(k+nums[i])){
                        count++;
                    }
                }
            } else {
                if(map.containsKey(nums[i])){
                    if(map.get(nums[i])==1){ // handel duplicates pairs
                        count++;
                    }
                }
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return count;
    }
}