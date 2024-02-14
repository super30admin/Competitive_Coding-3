//Time Complexity = O(n)
//Space Complexity = O(n) //HashSet // I took list and pair to test on local. In problem it has not been asked.
// Does it run on LeetCode successfully? : Yes
// Any difficulties: Handling it with HashSet. Num+Target and Num-Target

/*
Check for each and every number and its delta +/- with target with current index number. If it exist then it is pair.
If it is not then it is not pair that one is looking for.
Add all element to set

As we are just iterating Array once and adding to HashSet, duplicates will be handled automatically.
*/

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;


public class KPairsInArr {

    private List<Pair> list;

    class Pair {
        private int a;
        private int b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public int findPairs(int[] nums, int k, List<Pair> list) {
        int count = 0;
        if (nums == null || nums.length == 1) return count;
        Set<Integer> set = new HashSet<>();
        int target = k;
        if (k < 0) return 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i] - target)) {
                if (i != 0 && nums[i] != nums[i - 1]) {
                    Pair p = new Pair(nums[i], nums[i] - target);
                    count++;
                    list.add(p);
                }
            } else if (set.contains(nums[i] + target)) {
                if (i != 0 && nums[i] != nums[i - 1]) {
                    Pair p = new Pair(nums[i], nums[i] + target);
                    count++;
                    list.add(p);
                }
            }
            set.add(nums[i]);
        }
        return count;
    }

    public static void main(String[] args) {
        KPairsInArr obj = new KPairsInArr();
        obj.list = new ArrayList<>();
        int k = 3;
//        System.out.println("Pairs with target diff : " + obj.findPairs(new int[]{1,3,1,5,4}, 0));
//        System.out.println("Pairs with target diff : " + obj.findPairs(new int[]{1,3,-1,9,0,5,2}, 2, obj.list));

//        System.out.println("Pairs with target " + k + " diff : " + obj.findPairs(new int[]{1,3,-1,9,0,5,2},k, obj.list));
//        System.out.println("Pairs with target diff : " + obj.findPairs(new int[]{1,2,4,4,3,3,0,9,2,3}, 3, obj.list));
//        System.out.println("Pairs with target diff : " + obj.findPairs(new int[]{1,2,3,4,5}, 2, obj.list));
        System.out.println("Pairs with target diff : " + obj.findPairs(new int[]{5, 4, 3, 2, 1}, 2, obj.list));
        obj.list.stream().forEach(pair -> System.out.println(pair.a + "," + pair.b));

    }
}

//if (!set.contains(nums[i] - target)) { //we have to find only unique pairs --> (1,2) = (2,1)
//        set.add(nums[i]);
//            } else if (!set.contains(nums[i] + target)) {
//        set.add(nums[i]);
//            } else {
//                    if (i != 0 && nums[i] != nums[i - 1]) {
//Pair p = new Pair(nums[i], nums[i] - target);
//count++;
//        list.add(p);
//                }
//                        set.add(nums[i]);
//
//            }