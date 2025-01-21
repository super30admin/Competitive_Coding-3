import java.util.HashMap;
class Solution {
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public int findPairs(int[] nums, int k) {
       HashMap<Integer,Integer> set = new HashMap<>();
       int res =0;
       for (int i = 0; i< nums.length;i++) {
                set.put (nums[i], set.getOrDefault(nums[i],0)+1);
            }

       for (int num : set.keySet()){
        if (k == 0){
            if (set.get(num)>=2){
               res++; 
            }
        } else {
           if (set.containsKey(num+k))
           res++; 
        }
       }
       return res;
    }
}