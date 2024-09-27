// Time Complexity : O(n) where n is the length of input array
// Space Complexity : O(n) where n is the length of input array
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    Map<Integer,Integer> map = new LinkedHashMap<>();
    public int findPairs(int[] nums, int k) {
        if(k<0)
            return 0;
        int count=0;
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
        for(int n:map.keySet()){
            if(k==0){
                if(map.get(n)>1)
                    count++;
            }else{
                if(map.containsKey(n+k))
                    count++;
            }
        }
        return count;
    }
}