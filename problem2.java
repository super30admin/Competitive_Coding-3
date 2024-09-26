//time- O(n)
//space- O(n)
class Solution {
    public int findPairs(int[] nums, int k) {

       if(k < 0) {
           return 0;
       }
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap();

        for(Integer i : nums) {
            map.put(i, map.getOrDefault(i,0) + 1);
        }

        for(Integer i:map.keySet()) {
            if(k == 0) {
                if(map.get(i) > 1) {
                    count++;
                }
            } else {
                if(map.containsKey(i + k)) {
                    count++;
                }
            }
        }
        return count;
    }
} 