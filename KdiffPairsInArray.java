// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
import java.util.HashMap;

public class KdiffPairsInArray {
    public static int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            if (!hmap.containsKey(num)) {
                hmap.put(num, 1);
            } else {
                hmap.put(num, hmap.get(num) + 1);
            }
        }

        for(int i : hmap.keySet()) {
            if(hmap.containsKey(i+k) && k>0) {
                count++;
            }
            else if(hmap.get(i) > 1 && k==0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,-1,0,1,2,4,-3,-2,4,3,0};
        int k = 3;
        System.out.println("count of " + k + " diff pairs in given nums is "
                + findPairs(nums, k));
    }
}