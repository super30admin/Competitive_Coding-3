import java.util.HashMap;
import java.util.Map;
/*
K-diff unique pairs
time: O(n)
space: O(n)
 */
public class Problem2 {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> diffs = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(diffs.containsKey(nums[i])) diffs.put(nums[i], diffs.get(nums[i])+1);
            else
                diffs.put(nums[i],1);
        }

        int count=0;
        for(Map.Entry<Integer,Integer> entry:diffs.entrySet()){
            if(k==0) {
                if(entry.getValue()>=2) count++;
            }
            else {
                if(diffs.containsKey(entry.getKey()+k)) count++;
            }

        }

        return count;
    }
}
