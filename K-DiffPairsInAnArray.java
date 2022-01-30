class Solution {
    //TC : O(n)
    //SC : O(n)
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(int n : map.keySet()) {
            if(k > 0 && map.containsKey(n+k)) {
                count++;
            } else if(k == 0 && map.get(n) > 1) {
                count++;
            }
        }
        return count;
    }
}