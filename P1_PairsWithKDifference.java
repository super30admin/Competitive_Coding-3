// Time Complexity :O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :yes

class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Pair<Integer,Integer>> set = new HashSet<>();
        for(int i=0 ; i<nums.length ;i++) {
            int a = nums[i] + k;
            int b = nums[i] - k;
            if(map.containsKey(a)) {
                if(nums[i] < a)
                    set.add(new Pair<>(nums[i], a));
                else 
                    set.add(new Pair<>(a, nums[i]));
            } 
            if(map.containsKey(b)) {
                if(nums[i] < b)
                    set.add(new Pair<>(nums[i], b));
                else 
                    set.add(new Pair<>(b, nums[i]));
            } 
            if(!map.containsKey(nums[i]))
                map.put(nums[i], 1);
        }
        System.out.println(map);
        System.out.println(set);
        return set.size();
    }
}