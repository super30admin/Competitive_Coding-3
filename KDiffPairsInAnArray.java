// TC: O(n) (2-pass on array)
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
        for(i = 0; i < nums.length; i++) {
            if(k > 0) {
                int val = nums[i] + k;
                if(map.containsKey(val)) {
                    count++;
                    map.remove(val);
                }
            } else {
                if(map.get(nums[i]) > 1) {
                    count++;
                    map.put(nums[i], 1);
                }
            }
        }
        return count;
    }
}