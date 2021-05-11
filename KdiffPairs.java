/*
Desc:Using a stack i maintain the number of occurences of a number, while reiterating over stack, if k is 0 we increment 1 in the pair count,
in case of k>0 for every key we check if a key -> k+key is present in the hashmap, if found pair count is incremented
Time Complexity: O(n)
Space Complexity:O(n)
*/
//solution I gave in the interview
class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums==null || nums.length == 0) return 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i: nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int total = 0;
        //in case k is 0 we would have to check if the same number has appeared already
        // iterate the map to check every number
        // if k is 0, check if the frequency of the key is more than once.
        if (k == 0) {
            for (Integer val: map.values()) {
                if (val > 1) total++;
            }
        }
        // if k is > 0, check if there is another key(k+key) exist;
        else {
            for (Integer key: map.keySet()) {
                if (map.containsKey(k+key)) total++;
            }
        }
        return total;
    }
}
