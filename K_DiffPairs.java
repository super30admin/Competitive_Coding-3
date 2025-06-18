// Time Complexity : O(n) where n is the length of  array
// Space Complexity : O(n) where n is the length of array
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : initially had a little difficulty with edge cases

// Approach - My approach is to first have the unique elements with number of occurrences stored in the hashmap
// then iterate through the keys to find the number of unique pairs by adding the difference to key and checking whether
// the other element exist in the map or not and every tie we find it we increase the count
import java.util.*;
public class K_DiffPairs {
    static int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : nums) {
            map.put(val, map.getOrDefault(val, 0)+1);
        }

        int count = 0;
        for(int key : map.keySet()) {
            if(k == 0) {
                if(map.get(key) > 1) count++;
            } else {
                if(map.containsKey(key + k)) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,4,1,5};
        int k = 2;
        System.out.println("Number of Pairs in array " + Arrays.toString(nums) + " for difference " + k + " is: " + findPairs(nums, k));
    }
}
