// Problem - https://leetcode.com/problems/k-diff-pairs-in-an-array/description/

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nothing as such

public class problem2 {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int result = 0;
        
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0) + 1);
        }
        
        for(int n : map.keySet()){
            if(k == 0){
                if(map.get(n)>=2) result++;
            }else{
                if(map.containsKey(n + k)) result++;
            }
        }
        return result;
    }
}
