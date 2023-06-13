import java.util.*;
class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<List> set = new HashSet<>();        
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            
            if(map.containsKey(nums[i]-k)){
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(nums[map.get(nums[i]-k)]);
                Collections.sort(temp);
                set.add(temp);
            }
            map.put(nums[i],i);
            
        }
        return set.size();
    }
}