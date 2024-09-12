// Time Complexity :O(n)
// Space Complexity : O(n) n is the number of elements. (I'm confused here considering there are 3 auxillary DS)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        if(nums == null || nums.length==0 || k<0) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i < nums.length;i++){
            map.put(nums[i],i);
        }
        
        HashSet<List<Integer>> set  = new HashSet<>();
        
        for(int i =0;i < nums.length;i++){
            int complement1 = nums[i] +k;
            int complement2 = nums[i] -k;
            
            if(map.containsKey(complement1)){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(complement1);
                Collections.sort(list);
                if(!set.contains(list) && map.get(complement1) !=i){
                    count ++;
                    set.add(list);
                }
                
            }
            else if(map.containsKey(complement2)){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(complement2);
                Collections.sort(list);
                if(!set.contains(list) && map.get(complement2) !=i){
                    count ++;
                    set.add(list);
                }
                
            }
            
        }
        
        return count;
        
    }
}