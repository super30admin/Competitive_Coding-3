//Time Complexity: O(n)
//Space Complexity: O(n)

class Solution {
    public int findPairs(int[] nums, int k) {
        
        if(nums == null || nums.length == 0) return -1;
        
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0) + 1);
        }
        
        for(int num: map.keySet()){
            if(k == 0){
                if(map.get(num) >= 2) count++;
            }else {
                if(map.containsKey(num + k)) count++;
            }
        } 
        return count;
    }
}