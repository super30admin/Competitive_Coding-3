import java.util.HashMap;
/*
https://leetcode.com/problems/k-diff-pairs-in-an-array/description/
 */
public class KdiffPairsInArray {
    public static int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int count = 0;

        for (int num : nums) { //O(n) T.C
            if (!hmap.containsKey(num)) {
                hmap.put(num, 1); //O(n) S.C
            } else { //building a frequency hashmap
                hmap.put(num, hmap.get(num) + 1);
            }
        }

        for(int i : hmap.keySet()) { //O(1) T.C
            if(hmap.containsKey(i+k) && k>0) { //if hashmap contains both i and i+difference
                count++; //that means we found a pair
            }
            else if(hmap.get(i) > 1 && k==0) { //if given target is 0 and if any value has a duplicate
                count++; //that also counts as a pair
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