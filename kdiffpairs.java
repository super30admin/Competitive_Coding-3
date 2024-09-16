//Tc:o(n)
//Sc:o(n)
//https://leetcode.com/problems/k-diff-pairs-in-an-array/

class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0)   return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            if(map.containsKey(i)) 
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                if (entry.getValue()>1) {
                    count++;
                } 
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }
        return count;
    }
}
  
