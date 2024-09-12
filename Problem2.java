//  532. K-diff Pairs in an Array

class Solution {
    public int findPairs(int[] nums, int k) {
        // get a map of frequency of every number
        if (k < 0) return 0;
        Map<Integer, Integer> map = new HashMap();
        for (int i: nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        // iterate the map to check every number
        int total = 0;
        // if k is 0, check if the frequency of the key is more than once.
        if (k == 0) {
            for (Integer val: map.values()) {
                if (val > 1) total++;
            }
        }
        // if k is > 0, check if there is another key(k+key) exist;
        else {
            for (Integer key: map.keySet()) {
                if (map.containsKey(k+key)) total++;
            }
        }
        return total;
    }
}

/*
Complexity Analysis

N be the number of elements in the input list.
Time complexity : O(N).
It takes O(N) to create an initial frequency hash map and another O(N) to traverse the keys of that hash map. One thing to note about is the hash key lookup. The time complexity for hash key lookup is 
O(1) but if there are hash key collisions, the time complexity will become O(N). 
However those cases are rare and thus, the amortized time complexity is O(2N)≈O(N).
Space complexity : 
O(N) We keep a table to count the frequency of each unique number in the input. In the worst case, all numbers are unique in the array. As a result, the maximum size of our table would be 
O(N).
*/