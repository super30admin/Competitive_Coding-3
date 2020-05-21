//Time Complexity : O(n) Becuse of the hashmap
//Space Complexity : O(n) HashMap
//Runs succesfully on leetcode
// Took time understanding the edge case k < 0

//Here if the complement of a number is available in hashmap, we'll add 1 to the result
//If k == 0 , we can add the element only once


import java.util.HashMap;

public class Competitive_Coding_3_Problem_2_kthDiff {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) return 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Integer i : map.keySet()) {
            if (k == 0) {
                if (map.get(i) > 1) {
                    count++;
                }
            } else {
                if (map.containsKey(i + k)) {
                    count++;
                }
            }
        }
        return count;
    }
}
