// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
/*
Initialize a HashMap to store seen numbers and a HashSet to store unique valid pairs.
Iterate over the array and for each number:
Check if (num - k) exists in map ⇒ valid pair found.
Check if (num + k) exists in map ⇒ valid pair found.
In both cases, add [num, num±k] to a List, sort it, and insert into the set (to handle unordered duplicates).
Store current number in hashmap for future comparisons.
Return size of the HashSet (unique k-diff pairs).
*/


import java.util.*;

public class kDiffPairsInAnArray {
    public int solve(int[] nums, int k){
        if(nums==null || nums.length==0 || k<0){
            return 0;
        }
        HashMap<Integer, Integer> hmap = new HashMap<>();
        HashSet<List<Integer>> hset = new HashSet<>();

        for(int i=0; i < nums.length; i++){

            if(hmap.containsKey(nums[i]-k)){
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(nums[i]-k);
                Collections.sort(temp);
                hset.add(temp);
            }


            if(hmap.containsKey(nums[i]+k)){
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(nums[i]+k);
                Collections.sort(temp);
                hset.add(temp);
            }
        hmap.put(nums[i], i);
    }
    return hset.size();

}

public static void main(String[]args){
    kDiffPairsInAnArray ob = new kDiffPairsInAnArray();
    int[] nums1 = {3, 1, 4, 1, 5};
    int[] nums2 = {1, 2, 3, 4, 5};
    int[] nums3 = {1, 3, 1, 5, 4};
    int k1 = 2;
    int k2 = 1;
    int k3 = 0;

    System.out.println("k diff pairs are: "+ob.solve(nums1, k1));
    System.out.println("k diff pairs are: "+ob.solve(nums2, k2));
    System.out.println("k diff pairs are: "+ob.solve(nums3, k3));

}

    
}
