//Time: O(N)
//Space: O(N)

class Solution {
    public int findPairs(int[] nums, int k) {

        if (nums == null || nums.length == 0)
            return 0;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int i : map.keySet()) {

            int val = map.get(i);

            if (k == 0 && val > 1) {
                count++;
            } else if (k > 0 && map.containsKey(i + k)) {
                count++;
            }
        }
        return count;
    }
}