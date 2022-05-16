// Time Complexity :O(n)
// Space Complexity :O(n)+O(n) ===O(n) we are using hashMap and hashSet
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

//will store all elements in hashmap with indices in one pass and on second pass, will find ele-k and ele+k in map
// given condition that index should not be same, if element is found in hashMap, we'll sort the pair and add in hashset
//to avoid duplicacy as we need unique pairs. will return size of set 
class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int fDiff = nums[i] - k;
            int sDiff = nums[i] + k;
            if (map.containsKey(fDiff) && map.get(fDiff) != i) {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(fDiff);
                Collections.sort(temp);
                if (!set.contains(temp)) {
                    set.add(temp);
                }

            }
            if (map.containsKey(sDiff) && map.get(sDiff) != i) {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(sDiff);
                Collections.sort(temp);
                if (!set.contains(temp)) {
                    set.add(temp);
                }
            }
        }
        System.out.println(set);
        return set.size();
    }
}