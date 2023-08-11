// https://leetcode.com/problems/k-diff-pairs-in-an-array/description/
// Time Complexity : O(n)
// Space Complexity : O(n)


package S30_Codes.Competitive_Coding_3;
import java.util.HashMap;
import java.util.Map;

public class Problem2 {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i< nums.length; i++){
            if( (!map.containsKey(nums[i])) || ( k==0 && map.get(nums[i]) == 1 )){
                if( k==0 && map.getOrDefault(nums[i], 0) == 1 ){
                    count++;
                }
                else{
                    if(map.containsKey( Math.abs(nums[i] - k) )){
                        count++;
                    }
                    if(map.containsKey( Math.abs(nums[i] + k) )){
                        count++;
                    }
                }
                map.put( nums[i], map.getOrDefault(nums[i], 0)+1 );
            }
        }

        return count;
    }
}