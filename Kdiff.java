// Time Complexity :O(n) - length of array
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No 


// Your code here along with comments explaining your approach
class Solution {
    public int findPairs(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        // Check if solution present
        HashSet<List<Integer>> set = new HashSet<>();
        // int count =0;
        
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        int diff =0;
        
        for(int i=0;i<nums.length;i++)
        {
            diff = nums[i]-k;
            if(map.containsKey(diff) && map.get(diff)!=i)
            {
                //count++;
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(diff);
                Collections.sort(list);
                set.add(list);
            }

        }
        
        
        return set.size();
    }
}