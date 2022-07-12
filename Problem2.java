//Time Complexity: O(n)
//Space Complexity: O(n)
//Code run successfully on LeetCode.

public class Problem2 {

    public int findPairs(int[] nums, int k) {
        
        if(nums == null|| nums.length == 0)
            return -1;
        
        int count = 0;
        int diff = 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i =0; i < nums.length; i++)
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        
        for(int key: map.keySet()){
            
            if(k == 0)
            {
                if(map.get(key) > 1)
                    count++;
            }
            
            else
            {
                diff = key + k;
                if(map.containsKey(diff))
                   count++;
            }
            
        }
        return count;
    }
}
