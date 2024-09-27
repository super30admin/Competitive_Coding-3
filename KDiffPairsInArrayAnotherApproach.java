// TC: O(n)
// SC: O(n)
class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int count, i;
        count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            if(k > 0) {
                int val = e.getKey() + k;
                if(map.containsKey(val)) {
                    count++;
                }
            } else {
                if(map.get(e.getKey()) > 1) {
                    count++;
                }
            }
        }
        return count;
    }
}