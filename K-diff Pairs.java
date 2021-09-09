//Time complexity: O(N)
//Space complexity: O(N)
class Solution {
    public int findPairs(int[] nums, int k) {
        Set<List<Integer>> set = new HashSet<>();

        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for(int num: nums) {
            int diff = num - k;
            if((k == 0 && map.containsKey(diff) && map.get(num) > 1) || k > 0 && map.containsKey(diff)) {
                List<Integer> list = Arrays.asList(num, diff);
                Collections.sort(list);
                if(!set.contains(list)) {
                    set.add(list);
                    count++;
                }
            }
        }
        return count;
    }
}