// Time - O(N)
// Space - O(N)
class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        for (Map.Entry <Integer, Integer> entry: map.entrySet()) {
            int x =  entry.getKey();
            int val = entry.getValue();
            if(k==0) {
                if(val > 1) {
                    count++;
                }
            }
            else if(k>0 && map.containsKey(x+k)) {
                count++;
            }
        }
        
        return count;
    }
}
