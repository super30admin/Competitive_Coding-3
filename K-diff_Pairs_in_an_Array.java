//TC : O(n)
//SC : O(n)

class Solution {
    public int findPairs(int[] nums, int k) {
        
        if(nums.length == 0 || nums == null) return 0;
        
        int result = 0;
        HashMap<Integer, Integer> hMap = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            if(hMap.containsKey(nums[i])) {
                hMap.put(nums[i], hMap.get(nums[i])+1);
            }
            else
                hMap.put(nums[i], 0);
        }
        
        for(int i : hMap.keySet()) {
            if(k>0 && hMap.containsKey(i+k))
                result++;
            else if(k == 0 && hMap.containsKey(i+k) && hMap.get(i+k) > 0)
                result++;
        }
        return result;
    }
}


