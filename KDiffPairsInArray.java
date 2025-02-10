// Pascals triangle

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach in three sentences only
/*
 * Here, firstly all elements are added to hash map with their frequency. Next traverse through the keySet of hash map and if you find the value 
 * of key+k increase the result value when k is greater than 0. If k==0 then if frequency> 1 increase the result value. Finally, return the
 * result.
 */

class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int l = 0;
        int n = nums.length;
        int res = 0;
        while(l<n){
            if(!(map.containsKey(nums[l]))){
                map.put(nums[l],1);
            }
            else{
                map.put(nums[l], map.get(nums[l])+1);
            }
            l++;
        }

        for(int key: map.keySet()){
            int pos = key+k;
            if(k>0){
                if(map.containsKey(pos)){
                res+=1;
            }
            }
            else if(k==0){
                if(map.get(pos)>1){
                    res+=1;
                }
            }
        }
        
        return res;
    }
}