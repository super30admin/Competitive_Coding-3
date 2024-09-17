class Solution {
    public int findPairs(int[] nums, int k) {
        if(k < 0){
            return 0;
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            } else{
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        
        int count = 0;
        
        for(int num : map.keySet()){
            int comp = num + k;
            if(map.containsKey(comp)){
                if(k == 0){
                    if(map.get(num) >= 2){
                        count++;
                    }
                } else if(k > 0){
                    count++;
                }
            }
        }
        return count;
    }
}

//Time complexity:O(n)
//Space complexity:O(n)