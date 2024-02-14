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

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class KPairsInArrWithHashSet {

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
        HashSet<List<Integer>> pairs = new HashSet<>();
        HashSet<Integer> visited = new HashSet<>();
        if(k < 0) return 0;

        for(int num: nums){
            if(visited.contains(num - k)){
                pairs.add(Arrays.asList(num - k, num));
                Pair p = new Pair(num, num - k);
                list.add(p);
            }
            if(visited.contains(num + k)){
                pairs.add(Arrays.asList(num, num+k));
                Pair p = new Pair(num, num + k);
                list.add(p);
            }
            visited.add(num);
        }

        return pairs.size();
    }

    public static void main(String[] args) {
        KPairsInArrWithHashSet obj = new KPairsInArrWithHashSet();
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