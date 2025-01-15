// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution {
    public int findPairs(int[] nums, int k) {

        if(nums == null || nums.length == 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        // Using hashset to store unique pairs
       /* HashSet<int[]> s = new HashSet<>();
        int count = 0;
        int res = 0;
       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(k == 0){
                if(entry.getValue() >= 2){
                    count++;
                }
            }else if(map.containsKey(Math.abs(entry.getKey() - k))){
                /*int[] n = new int[]{entry.getKey(),entry.getKey() + k};
                Arrays.sort(n);
                if(!s.contains(n)){
                    s.add(n); 
                }
                res++;

            }
        }*/

        for(int key : map.keySet()){
            if(k == 0){
                if(map.get(key) >= 2){
                    count++;
                }
            }else if(map.containsKey(key - k)){
                count++;
            }
        }

        if(k == 0){ 
            return count;
        }

        return count;
        
    }
}