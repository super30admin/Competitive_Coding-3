// TC - O(n), SC - O(n)

class Solution {
    public int findPairs(int[] nums, int k) {
        // Initialize a map to store nums array data, key would be the number appeared in array and value would be number of times the same number repeated
        Map<Integer, Integer> map = new HashMap<>();
        // Iterate through nums array and add it to hashmap
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        // initialize count to 0
        int count = 0;
        
        // Iterate through map
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            
            // If the k is 0, then if the same value occurs twice, that will be a possible pair, else if k>0, check if map contains key + k, increment count in these both cases
            if(k == 0 && value > 1){
                count++;
            }else if(k > 0){
                if(map.containsKey(key + k)){
                    count++;
                }
            }
            
        }
        return count;
    }
}