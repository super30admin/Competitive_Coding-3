/*
 * Time Complexity : O(n)
 * Space Complexity :  O(n)
 * Did this code successfully run on Leetcode : yes
 * Any problem you faced while coding this : No
 * 
 * Approach - In this we create a hashmap for every element in the array. We then find the complement of the target element we need to find. 
 * We check if the complement is present. If present we push both the elements into the result hashmap to prevent any duplicates.
 */

//https://leetcode.com/problems/k-diff-pairs-in-an-array/
class KDiffPairsInArray {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> res = new HashMap<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int i=0;
        int j;
        for(i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int diff;
        for(j=0;j<nums.length;j++){
            diff= k+nums[j];
            if(map.containsKey(diff)  && j!=map.get(diff)){
                if(nums[j]-diff==k) res.put(diff,nums[j]);
                else res.put(nums[j], diff); 
            }
        }
        return res.size();
    }
}