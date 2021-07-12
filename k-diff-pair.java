//TC: O(N)
//SC: O(N)
class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return -1;
        
        Map<Integer, Integer> result = new HashMap<>();
        int count = 0;
        
        for(int i=0; i<nums.length; i++) {
            result.put(nums[i], result.getOrDefault(nums[i], 0)+1);
        }
        System.out.println(result);
        
        for(Integer i : result.keySet()) {
            if(k==0) {
                if(result.get(i)>1)
                    count++;
            }else {
                if(result.containsKey(i+k)) {
                    count++;
                }
            }
            
        }
        return count;
    }
}