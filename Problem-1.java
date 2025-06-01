// Time complexity - O(n)
// Space complexity - O(n)
// Did you solve in leetcode - yes
// Problems faced - NO
// Initially, mapping the elements in hash map and then chceking if k+i exists in the map or not
//based on this incrementing the count
class Solution {
    public int findPairs(int[] nums, int k) {
        int count =0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums) {
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(int i: map.keySet()) {
            int b = (k+i);
          
            if(map.containsKey(b) && map.get(b) >0 && map.containsKey(i) && map.get(i)>0) {
                if(i == b) map.put(i, map.get(i)-1);
                if(map.get(b) > 0) {
                count++;
                if(i == b) 
                map.put(b, map.get(b)-1); 
                }
            }
        }
        return count;
    }
}
