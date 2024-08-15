class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println(map.keySet());

        for (int num : map.keySet()) {
            if (k > 0) {
                if (map.containsKey(num + k)) {
                    count++;
                }
            } else if (k == 0) {
                if (map.get(num) > 1) {
                    count++;
                }
            }
        }
        return count;
    }
}
