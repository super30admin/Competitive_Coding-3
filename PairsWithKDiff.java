// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach:
/*
Make freq map
if k+num is present then increase count
handle '0' case sepeately, when k is given as 0, if freq of num>1 only then count++
*/
public class PairsWithKDiff {
    public int findPairs(int[] nums, int k) {
        if(nums==null || nums.length==0) return 0;

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++)
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);

        int count=0;
        for(int num:hm.keySet()){
            if(k==0 && hm.get(num)>1) count++;
            else if(hm.containsKey(k+num) && k!=0) count++;
        }

        return count;
    }
}
