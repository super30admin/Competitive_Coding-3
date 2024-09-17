import java.util.HashMap;
import java.util.Map;
//Leetcode - 532
//Time Complexity - O(N)
//Space Complexity - O(N)
public class KDiffPairs {

    int count =0;
    public int findPairs(int[] nums, int k) {

        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(k == 0) {
                if(entry.getValue()>1) count++;
            }
            else if(map.containsKey(entry.getKey()+k))
            {
                count++;
            }
        }
        return count;
    }
}
